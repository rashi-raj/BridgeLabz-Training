package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class EmployeeDTO {
    int id;
    int salary;

    EmployeeDTO(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return id + " -> " + salary;
    }
}

class MapToDTOList {
    public static void main(String[] args) {
        Map<Integer, Integer> map = Map.of(101, 50000, 102, 60000);

        List<EmployeeDTO> list =
                map.entrySet()
                   .stream()
                   .map(e -> new EmployeeDTO(e.getKey(), e.getValue()))
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
