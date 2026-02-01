package com.methodreferences;
import java.util.List;

public class PatientIdPrinter {

    public static void main(String[] args) {

        List<Integer> patientIds = List.of(101, 102, 103, 104);

        // Using method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}
