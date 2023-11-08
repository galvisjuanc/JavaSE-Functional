package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply("Hola Estudiante de platzi"));

        System.out.println(addMark.apply("Natalie bella"));

        BiFunction<Integer, Integer, Integer> multiplicacion =
                (x, y) -> x * y;
        System.out.println("Multiplicación es : " + multiplicacion.apply(5,9));

        BinaryOperator<Integer> mult = (x,y) -> x * y;

        System.out.println(mult.apply(12, 14));
    }
}
