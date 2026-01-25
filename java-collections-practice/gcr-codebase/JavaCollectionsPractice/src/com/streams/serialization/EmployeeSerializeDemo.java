package com.streams.serialization;

/*
4. Serialization - Save and Retrieve an Object
Serialize and deserialize list of employees.
*/
import java.io.*;
import java.util.*;

public class EmployeeSerializeDemo {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Amit", "IT", 50000));
        list.add(new Employee(2, "Ravi", "HR", 45000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("emp.dat"))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("emp.dat"))) {

            List<Employee> empList = (List<Employee>) ois.readObject();
            empList.forEach(e ->
                    System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
