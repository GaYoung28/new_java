package org.example.day4.array;

import java.util.Random;

public class 배열토익 {
    public static void main(String[] args) {
        //1. 답안 배열, 내답 배열
        //2. Random 이용해서 1~4까지 범위로 하여 배열에 990개를 넣으세요.
        //3. 답안과 내 답의 인덱스값을 각각 비교해서 맞으면 1점!
        //4. 총점을 출력해주세요.!

        int[] 답안 = new int[990];
        int[] 내답 = new int[990];

        Random r = new Random(42);
        for (int i = 0; i < 내답.length; i++) {
            답안[i] = r.nextInt(4) + 1;
            내답[i] = r.nextInt(4) + 1;
        }
        int jumsu = 0;
        for (int i = 0; i < 내답.length; i++) {
            if (답안[i] == 내답[i]) {
                jumsu++;
            }
        }
        System.out.println(jumsu);




    }
    }


