package com.annotation.deprecated;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature (do not use)");
    }

    public void newFeature() {
        System.out.println("New improved feature");
    }

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();   // warning
        api.newFeature();
    }
}
