package com.goit.module11;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamExercises5 {
    public static class StreamZipper {

        public static void main(String[] args) {
            Stream<Integer> stream1 = Stream.of(1, 2, 3);
            Stream<Integer> stream2 = Stream.of(4, 5, 6, 7);

            Stream<Integer> zippedStream = zip(stream1, stream2);
            zippedStream.forEach(System.out::println);
        }

        public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
            var firstList = first.collect(Collectors.toList());
            var secondList = second.collect(Collectors.toList());
            return IntStream.range(0, Math.min(firstList.size(), secondList.size()))
                    .boxed()
                    .flatMap(i -> Stream.of(firstList.get(i), secondList.get(i)));
        }
    }

    static class Pair<T> {
        private T first;
        private T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public Stream stream() {
            return Stream.of(first, second);
        }
    }
}
