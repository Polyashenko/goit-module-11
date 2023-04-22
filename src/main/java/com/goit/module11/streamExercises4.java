package com.goit.module11;

import java.util.stream.Stream;

public class streamExercises4 {

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 12345L;

        Stream<Long> randomStream = LinearCongruentialGenerator.generate(a, c, m, seed);
        System.out.println("Stream create");
        randomStream.limit(10).forEach(System.out::println);
    }
    public class LinearCongruentialGenerator {
        public static Stream<Long> generate(long a, long c, long m, long seed) {
            return Stream.iterate(seed, n -> {
                System.out.println("calculate " + n);
                return  (a * n + c) % m;
            });
        }
    }
}


// У методі generate ми використовуємо Stream.iterate для
// генерації безкінечного стріму чисел. Починаючи з початкового значення seed,
// кожне наступне число генерується за формулою x[n + 1] = (a * x[n] + c) % m.
//
//У методі main ми тестуємо наш генератор, генеруючи 10 перших чисел і виводячи їх на екран.
