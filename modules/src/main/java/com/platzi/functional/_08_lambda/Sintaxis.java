package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {

    public static void main(String[] args) {
        System.out.println("Lambda");
        List<String> cursos = NombresUtils.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero( () -> 2);
        usarPredicado(text -> text.isEmpty());
        usarBifunction((x , y) -> x * y);

        usarBifunction((x , y) -> {
            System.out.println("X: " + x + ", Y:" + y);
            return x - y;
        });


    }

    static void usarZero(ZeroArgumentos zeroArgumentos) {

    }

    static void usarPredicado(Predicate<String> predicate) {

    }

    static void usarBifunction(BiFunction<Integer, Integer, Integer> operacion) {

    }

    @FunctionalInterface
    interface  ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }
}
