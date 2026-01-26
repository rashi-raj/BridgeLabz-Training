package com.annotation.customannotation;

import java.lang.reflect.Method;

public class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Rashi")
    public void completeTask() {
        System.out.println("Task completed");
    }

    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("completeTask");
        TaskInfo info = m.getAnnotation(TaskInfo.class);

        System.out.println(info.priority());
        System.out.println(info.assignedTo());
    }
}
