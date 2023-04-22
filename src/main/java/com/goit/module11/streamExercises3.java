package com.goit.module11;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamExercises3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = sortAndJoinArray(array);
        System.out.println(result);
    }

    public static String sortAndJoinArray(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Stream.of(s.split(",\\s*")))
                .map(Integer::valueOf)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

}
