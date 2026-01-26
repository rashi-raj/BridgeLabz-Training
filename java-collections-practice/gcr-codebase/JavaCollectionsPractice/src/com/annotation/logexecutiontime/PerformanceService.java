package com.annotation.logexecutiontime;

import java.lang.reflect.Method;

public class PerformanceService {

    @LogExecutionTime
    public void slowTask() throws InterruptedException {
        Thread.sleep(300);
    }

    @LogExecutionTime
    public void fastTask() throws InterruptedException {
        Thread.sleep(100);
    }

    public static void main(String[] args) throws Exception {
        PerformanceService service = new PerformanceService();

        for (Method m : PerformanceService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(service);
                long end = System.nanoTime();

                System.out.println(
                    m.getName() + " executed in " + (end - start) + " ns"
                );
            }
        }
    }
}
