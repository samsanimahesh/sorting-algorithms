package com.mahesh.java8.lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {

    public static void main(String[] args) {
        Function<String, Integer> integerFunction = x -> x.length();

        List<String> listOfStrings = Arrays.asList("Mahesh", "babu", "Samsani");

        System.out.println(listOfStrings.stream().map(integerFunction.andThen(x -> x*2)).collect(Collectors.toList()));
    }
}
