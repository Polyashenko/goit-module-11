package com.goit.module11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streamExercises {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("Dima", "Viktoria", "Timofey", "Kira", "Tanya");
        System.out.println(listOdd(input));
    }

    public static String listOdd(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
