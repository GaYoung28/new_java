package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        //기본형 변수를 정리 - 정수, 실수, 문자1, 논리
        float temp = 23.5F; // ==> double
        byte date = 26; // -128 ~ 127 ==> int
        final char DAY = '목';
        boolean food = true;
        food = false;

        String roomNo = "강의장 6호";


        System.out.println("온도: " + temp + "도");
        System.out.println("날짜: " + date + "일");
        System.out.println("요일: " + DAY);
        System.out.println("음식 여부: " + food);
        System.out.println("강의실 번호: " + roomNo);


    }
}
