package com.annotation.customserialization;

import java.lang.reflect.Field;

public class JsonUser {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public JsonUser(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");

        for (Field f : obj.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(JsonField.class)) {
                f.setAccessible(true);
                JsonField jf = f.getAnnotation(JsonField.class);
                json.append("\"")
                    .append(jf.name())
                    .append("\":\"")
                    .append(f.get(obj))
                    .append("\",");
            }
        }
        json.deleteCharAt(json.length() - 1);
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        JsonUser u = new JsonUser("Rashi", 22);
        System.out.println(toJson(u));
    }
}
