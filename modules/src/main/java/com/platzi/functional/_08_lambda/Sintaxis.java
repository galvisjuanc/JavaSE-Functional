package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;

public class Sintaxis {

    public static void main(String[] args) {
        System.out.println("Lambda");
        List<String> cursos = NombresUtils.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero( () -> 2);


    }

    static void usarZero(ZeroArgumentos zeroArgumentos) {

    }

    @FunctionalInterface
    interface  ZeroArgumentos {
        int get();
    }
}
