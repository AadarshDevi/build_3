package main.java.backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import lib.informationholder.Entertainment;
import lib.informationholder.Movie;
import main.java.api.API;
import main.java.frontend.Module;
import main.java.util.Logging;

public class Backend {

    private static int app_group_version = 2;
    private static int app_build_version = 3;
    private static int app_major_version = 1;
    private static int app_minor_version = 0;
    private static int app_path_version = 0;

    private API api;

    private String datafile_filepath = "D:/Programming/Java/Projects/Entertainment_Tracker/Builds/data/data.txt";

    private ArrayList<Entertainment> list;
    private ArrayList<Module<Entertainment>> module_list;

    private File file;

    private int module_count;

    public Backend(API api) {
        this.api = api;
        list = new ArrayList<Entertainment>();
        module_list = new ArrayList<Module<Entertainment>>();
        readData();
    }

    private void readData() {

        file = new File(datafile_filepath);
        module_count = 0;

        try {
            Scanner filereader = new Scanner(file);

            while (filereader.hasNextLine()) {

                module_count++;
                String data[] = filereader.nextLine().split("<>");

                Module<Entertainment> module;

                switch (data[0]) {
                    case "Movie":
                        Movie movie = new Movie(module_count, data[1], Integer.parseInt(data[2]),
                                Integer.parseInt(data[3]), data[4].split("::"),
                                convert_string_to_int(data[5]));

                        module = new Module<Entertainment>(movie, api);
                        module_list.add(module);
                        break;
                    default:
                        Logging.log(Logging.ERROR, this, "Entertainment Not Found: " + data[0]
                                + " (datafile line " + module_count + ")");
                }
            }
            filereader.close();
        } catch (FileNotFoundException e) {
            Logging.log(Logging.ERROR, this, "File Not Found: " + file.getPath());
        }

    }

    private int[] convert_string_to_int(String string) {

        String[] stringed_status = string.split(" ");
        int[] status = new int[stringed_status.length];

        for (int i = 0; i < status.length; i++) {

            status[i] = Integer.parseInt(stringed_status[i]);

        }
        return status;
    }

    public ArrayList<Entertainment> getData() {
        return list;
    }

    private void writeData() {
        Logging.log(Logging.PROCESS, this, "Data Written");
    }

    public String getBuildNumber() {

        return String.format("%s.%s.%s.%s.%s", app_group_version, app_build_version, app_major_version,
                app_minor_version, app_path_version);
    }

    public void exit() {
        Logging.log(Logging.PROCESS, this, "Exiting App");

        writeData();
        // Exit Processes...

        Logging.log(Logging.PROCESS, this, "Exited App");
        System.exit(0);
    }

    public int getModuleCount() {
        return module_count;
    }

    public ArrayList<Module<Entertainment>> getModules() {
        return module_list;
    }

}