package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림4 {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(-3,5,-2,7,-8,2);
        numbers.stream()
                .filter(n->n<0)
                .forEach(System.out::println);
    }
}
