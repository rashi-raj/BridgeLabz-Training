package com.functionalinterface.defaultmethod.dataexportfetaure;

public class ReportApp {
    public static void main(String[] args) {

        ReportExporter csv = new CSVExporter();
        ReportExporter pdf = new PDFExporter();

        csv.export();
        csv.exportToJSON();   // default method

        pdf.export();
        pdf.exportToJSON();   // default method
    }
}
