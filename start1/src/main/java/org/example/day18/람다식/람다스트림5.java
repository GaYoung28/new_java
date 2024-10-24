package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        words.stream() //몇개만 선택 -> filter/ 전체를 다 똑같은 처리 -> map
                .map(word -> word.substring(0,1)) //하나씩 꺼내서 똑같이 모든 처리할 때 map사용
                .forEach(System.out::println);
    }
}
