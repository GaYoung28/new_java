package org.example.day19.스트림;

import java.util.ArrayList;
import java.util.List;

public class 객체스트림만들기 {
    public static void main(String[] args) {
        //컬렉션, 배열, 파일, 랜덤하게 만들 수도 있음.
        // 1. 컬렉션 (list, set, map, queue)
        List<Integer> list = new ArrayList<>();
        //Stream<Integer>를 생성!
        //통로 Stream[Integer주소, Integer주소, Integer주소]
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);
        System.out.println(
        list.stream()
                .map(x -> x + 100)
                //.sum() --> 객체 스트림(주소가 들어있음)이므로 sum 사용할 수 없음.

                .mapToInt(Integer::intValue)// int Value -> 기본형 스트림으로 만들어주기
                //.mapToInt(Integer::intValue) == .mapToInt(x -> Integer.intValue(x)) : intStream

                .sum()
                //.forEach(x -> System.out.println(x)); // forEach는 맨 끝에만 쓸 수 있음.
        );
    }
}
