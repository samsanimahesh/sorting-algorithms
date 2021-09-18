package com.mahesh.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> testPredicate = x -> x>5;
        Predicate<Integer> testPredicate2 = x -> x<8;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().filter(testPredicate.and(testPredicate2)).collect(Collectors.toList()));


        System.out.println("============= Finding duplicate elements ================" );
        List<Integer> duplicate = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 1, 9, 10);
        duplicate.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toList()).forEach(el -> System.out.println(el));

        duplicate.stream().filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet()).forEach(e -> System.out.println(e));

        System.out.println("=========================================================");
        Stream.of("one", "two2", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());



    }
}
