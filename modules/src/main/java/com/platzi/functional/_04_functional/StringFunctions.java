package com.platzi.functional._04_functional;

import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        System.out.println(quote.apply("Hola Estudiante de platzi"));
    }
}
