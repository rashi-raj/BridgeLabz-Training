package com.functionalinterface.defaultmethod.dataexportfetaure;

class CSVExporter implements ReportExporter {
    public void export() {
        System.out.println("Exporting report to CSV");
    }
}

class PDFExporter implements ReportExporter {
    public void export() {
        System.out.println("Exporting report to PDF");
    }
}
