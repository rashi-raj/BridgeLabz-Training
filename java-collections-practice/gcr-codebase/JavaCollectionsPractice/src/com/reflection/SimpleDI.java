package com.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service {
    void serve() {
        System.out.println("Service called");
    }
}

class Client {
    @Inject
    Service service;
}

public class SimpleDI {
    public static void main(String[] args) throws Exception {

        Client client = new Client();

        for (Field f : client.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(client, f.getType().getDeclaredConstructor().newInstance());
            }
        }

        client.service.serve();
    }
}
