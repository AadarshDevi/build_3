package main.java.util;

import java.util.ArrayList;

import lib.informationholder.Anime;
import lib.informationholder.Entertainment;
import lib.informationholder.Movie;

public class Logging {

    public static final String DEBUG = "Debug";
    public static final String PROCESS = "Process";
    public static final String ERROR = "Error";

    public static void log(String log_type, Object object, String msg) {

        if (log_type.equals(ERROR))
            System.out.printf("[%s >> %s] %s\n", log_type, object.getClass().getSimpleName(), msg);
        else
            System.out.printf("[%s :: %s] %s\n", log_type, object.getClass().getSimpleName(), msg);
    }

    /**
     * the method will iterate through every entertainment on the entertainment list
     * and search for titles with the longest name. it will take the longest names
     * and put them in an arraylist and return it.
     * 
     * @param entertainmentlist the list of entertainments
     * @return a list of entertainments with the longest titles on the list
     */
    public static ArrayList<String> longestTitle(ArrayList<Entertainment> entertainmentlist) {

        ArrayList<String> list = new ArrayList<>();

        String name = "";
        int index = 0;
        int length = 0;

        for (Entertainment entertainment : entertainmentlist) {

            if (entertainment instanceof Movie) {
                Movie movie = (Movie) entertainment;
                name = movie.getFranchise();
            } else if (entertainment instanceof Anime) {
                Anime anime = (Anime) entertainment;
                name = anime.getFranchise() + ": " + anime.getTitle();
            }

            if (name.length() >= length) {
                list.add(name);
                index++;
                length = name.length();

                for (String string : list) {
                    if (string.length() < length) {
                        list.remove(string);
                    }
                }
            }
        }

        return list;
    }
}
