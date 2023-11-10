package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<String> courseLIst = NombresUtils.getList(
                "Java",
                "Frontend",
                "Backend",
                "FullStack");

        for (String course: courseLIst) {
            String newCourseName = course.toLowerCase().replace("!", "!!");
            System.out.println("Cursos: " + newCourseName);
        }
    }
}
