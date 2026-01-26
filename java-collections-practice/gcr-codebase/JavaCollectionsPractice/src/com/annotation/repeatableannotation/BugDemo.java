package com.annotation.repeatableannotation;

import java.lang.reflect.Method;

public class BugDemo {

    @BugReport(description = "Null Pointer Issue")
    @BugReport(description = "Performance Issue")
    public void process() {}

    public static void main(String[] args) throws Exception {
        Method m = BugDemo.class.getMethod("process");

        BugReport[] reports = m.getAnnotationsByType(BugReport.class);
        for (BugReport b : reports) {
            System.out.println(b.description());
        }
    }
}
