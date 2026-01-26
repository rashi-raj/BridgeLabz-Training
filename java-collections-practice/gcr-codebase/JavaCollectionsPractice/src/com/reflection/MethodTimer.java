package com.reflection;

import java.lang.reflect.Method;

class Task {
    public void execute() throws InterruptedException {
        Thread.sleep(500);
    }
}

public class MethodTimer {
    public static void main(String[] args) throws Exception {

        Task task = new Task();
        Method method = Task.class.getMethod("execute");

        long start = System.nanoTime();
        method.invoke(task);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
