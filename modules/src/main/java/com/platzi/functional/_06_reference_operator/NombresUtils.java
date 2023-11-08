package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {
    static <T> List<T> getList(T...elements) {
        return Arrays.asList(elements);
    }

    public static void main(String[] args) {
        List<String> profesores = getList("Nicolas", "Juan", "Natalie");

        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);

        System.out.println("//// Division /////");
        profesores.forEach(System.out::println);

    }

}
