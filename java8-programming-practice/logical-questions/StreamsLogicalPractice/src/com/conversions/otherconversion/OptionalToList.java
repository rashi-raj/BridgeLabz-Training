package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class OptionalToList {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Rashi");

        List<String> list = opt.stream().collect(Collectors.toList());

        System.out.println(list);
    }
}
