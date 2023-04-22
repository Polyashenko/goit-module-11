package com.goit.module11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamExercises2 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Dima", "Viktoria", "Timofey", "Kira", "Tanya");
        System.out.println(listUppercase(input));

    }

    public static List<String> listUppercase(List<String> input) {
        List<String> result = input.stream()
                .map(word -> word.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
        return result;
    }
}
