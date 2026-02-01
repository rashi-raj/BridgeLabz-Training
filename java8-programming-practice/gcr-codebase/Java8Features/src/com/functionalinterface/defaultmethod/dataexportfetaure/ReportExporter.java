package com.functionalinterface.defaultmethod.dataexportfetaure;

public interface ReportExporter {

    void export();

    // New default method
    default void exportToJSON() {
        System.out.println("Exporting report to JSON format");
    }
}
