package org.example.quiz.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        List<String> words = strings.stream().filter(word -> word.length()==1).collect(Collectors.toList());
        System.out.println(words);

        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        List<String> result = images.stream().filter(image -> image.contains("jpeg")).collect(Collectors.toList());
        System.out.println(result);
    }
}
