package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림8 {
    public static void main(String[] args) {
        List<String>words = Arrays.asList("java","lambda","stream","example");
        words.stream().map(String::length).forEach(System.out::println); // 함수이름으로 지정해서
        words.stream().map(word -> word.length()).forEach(System.out::println); //람다함수로
    }
}
