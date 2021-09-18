package com.mahesh.java8.lambdafunctions;

import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (a, b) -> String.join("-", a, b);

        System.out.println(biFunction.apply("mahesh", "babu"));
    }
}
