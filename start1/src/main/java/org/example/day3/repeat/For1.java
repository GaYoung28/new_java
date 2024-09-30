package org.example.day3.repeat;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        //3번 환영합니다.(횟수) 출력
        for(int i = 1; i < 4; i++) {
            System.out.println("환영합니다.");
        }


        //숫자를 100부터 200까지 출력
        for(int i = 100; i < 201; i++){ //i값 출력
            System.out.println(i);
        }


        //Random한 정수값 5개 출력(범위는 0~99)
        Random r = new Random();
        for (int i = 1; i < 6; i++) {
            int num = r.nextInt(100);
            System.out.println(num);

        }


    }


}

