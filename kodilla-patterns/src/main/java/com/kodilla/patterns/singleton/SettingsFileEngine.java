package com.kodilla.patterns.singleton;

public enum SettingsFileEngine {
    INSTANCE;

    private String fileName = "";

    public String getFileName() {
        return fileName;
    }

    public void open(final String  fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Close the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Looading settings from file");
        return true;
    }

    public boolean seveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}