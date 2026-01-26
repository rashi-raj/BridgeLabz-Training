package com.reflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Rashi")
class Book { }

public class AnnotationReader {
    public static void main(String[] args) {

        Author author = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + author.name());
    }
}
