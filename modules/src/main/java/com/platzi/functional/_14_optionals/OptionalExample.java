package com.platzi.functional._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    static List<String> getNames() {
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        return null;
    }

    static int mostExpensiveItem() {
        return -1;
    }

    static Optional<List<String>> getOptionalNames() {
        List<String> namesList = new LinkedList<>();
        return Optional.of(namesList);
    }

    static Optional<String> optionalValuablePlayer() {
        //return Optional.ofNullable();
        try {
            return Optional.of("JuanCamilo");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        List<String> names = getNames();

        if(names != null) {
            // Operar con nombres
        }

        Optional<List<String>> optionalNames = getOptionalNames();

        optionalNames.ifPresent(namesValues -> namesValues.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuablePlayer();

        String valuablePlayerName = valuablePlayer.orElseGet(() -> "No player");

        System.out.println(valuablePlayerName);
    }
}
