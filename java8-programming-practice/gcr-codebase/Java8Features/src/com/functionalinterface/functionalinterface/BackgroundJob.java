package com.functionalinterface.functionalinterface;
public class BackgroundJob {

    public static void main(String[] args) {

        // Runnable using lambda
        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job completed!");
        };

        // Run task asynchronously
        Thread thread = new Thread(job);
        thread.start();
    }
}
