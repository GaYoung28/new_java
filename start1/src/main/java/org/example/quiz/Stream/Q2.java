package org.example.quiz.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> result = numbers.stream().filter(n->n>3).collect(Collectors.toList());
        List<Integer> result2 = numbers.stream().map(n->n*10).collect(Collectors.toList());

        System.out.println(result);
        System.out.println(result2);
    }
}
