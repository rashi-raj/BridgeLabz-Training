package com.annotation.importantmethod;

import java.lang.reflect.Method;

public class ImportantService {

    @ImportantMethod
    public void processPayment() {}

    @ImportantMethod(level = "LOW")
    public void generateReport() {}

    public static void main(String[] args) {
        Method[] methods = ImportantService.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(
                    m.getName() + " → Importance: " + im.level()
                );
            }
        }
    }
}
