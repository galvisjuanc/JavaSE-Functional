package com.platzi.functional._04_functional;

import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply("Hola Estudiante de platzi"));

        System.out.println(addMark.apply("Natalie bella"));


    }
}
