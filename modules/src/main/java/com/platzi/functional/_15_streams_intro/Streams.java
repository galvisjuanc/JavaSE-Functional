package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> courseLIst = NombresUtils.getList(
                "Java",
                "Frontend",
                "Backend",
                "FullStack");

        for (String course: courseLIst) {
            String newCourseName = course.toLowerCase().replace("!", "!!");
            System.out.println(" .. Cursos --> " + newCourseName);
        }

        Stream<String> coursesStream = Stream.of(
                "Java",
                "Frontend",
                "Backend",
                "FullStack");

        //Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());
        //Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);

        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");

        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("Java"));

        justJavaCourses.forEach(System.out::println);
    }
}
