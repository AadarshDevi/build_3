package main.java.api;

import java.util.ArrayList;

import lib.informationholder.Entertainment;
import main.java.backend.Backend;
import main.java.backend.SearchEngine;
import main.java.frontend.MainFrame;
import main.java.frontend.Module;

public class API {

    // frontend
    private MainFrame mainframe;

    // backend
    private Backend backend;
    private SearchEngine searchengine;

    public API() {
        backend = new Backend(this);
        searchengine = new SearchEngine(this);

        // mainframe = new MainFrame(this);
    }

    public void view(Entertainment entertainment) {
        // mainframe.getInformationViewer().view(entertainment);
    }

    public MainFrame getMainframe() {
        return mainframe;
    }

    public Backend getBackend() {
        return backend;
    }

    public SearchEngine getSearchengine() {
        return searchengine;
    }

    public String getBuildNumber() {
        return String.format("EntertainmentTracker.%s   ", backend.getBuildNumber());
    }

    public void quit_app() {
        backend.exit();
    }

    public ArrayList<Entertainment> getData() {
        return backend.getData();
    }

    public int getModuleCount() {
        return backend.getModuleCount();
    }

    public ArrayList<Module<Entertainment>> getModules() {
        return backend.getModules();
    }
}
