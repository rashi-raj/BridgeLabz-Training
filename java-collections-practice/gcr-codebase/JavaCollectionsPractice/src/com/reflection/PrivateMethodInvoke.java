package com.reflection;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class PrivateMethodInvoke {
    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        Object result = method.invoke(calc, 3, 4);
        System.out.println("Result = " + result);
    }
}
