package com.hashmap.myhashmap;

public class CustomHashMap{
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(6, 20);
        map.put(11, 30);

        System.out.println(map.get(6));
        map.remove(6);
        System.out.println(map.get(6));
    }
}