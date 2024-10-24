package org.example.quiz.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {
    public static void main(String[] args) {
        //1.
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        numbers.stream().distinct().forEach(System.out::println);


        //2.
        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        List<String> fruits = strings.stream().filter(fruit -> fruit.length() >=5).collect(Collectors.toList());
        System.out.println(fruits);
    }
}
