package com.annotation.todo;

import java.lang.reflect.Method;

public class ProjectTasks {

    @Todo(task = "Implement login", assignedTo = "Rashi", priority = "HIGH")
    public void loginFeature() {}

    @Todo(task = "Add search feature", assignedTo = "Amit")
    public void searchFeature() {}

    public static void main(String[] args) {
        Method[] methods = ProjectTasks.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);
                System.out.println(
                    m.getName() + " | " +
                    todo.task() + " | " +
                    todo.assignedTo() + " | " +
                    todo.priority()
                );
            }
        }
    }
}
