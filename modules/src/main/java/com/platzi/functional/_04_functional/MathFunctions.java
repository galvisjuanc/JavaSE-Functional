package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                    return x*x;
            }
        };

        System.out.println(square.apply(5));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 0;

        System.out.println(isOdd.apply(3));

        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;

        Student jcgc = new Student(5.9);
        System.out.println(isApproved.test(jcgc));
    }

    static class Student{
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(double calificacion) {
            this.calificacion = calificacion;
        }
    }
}
