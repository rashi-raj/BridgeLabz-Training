package com.exceptions;

/*
8. Exception Propagation
method1 → method2 → main
*/
public class ExceptionPropagationDemo {

    static void method1() {
        int x = 10 / 0;
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
