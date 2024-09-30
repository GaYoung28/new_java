package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열로또2 {
    public static void main(String[] args) {


        int[] lotto = new int[6];
        //랜덤한 값(시드값 42) 6개를 만들어서 넣으세요.
        //범위는 1부터 45까지

        Random r = new Random();
        for (int i = 0; i < lotto.length; i++) { //6번만 무조건 발생!!!
            //lotto[i] = r.nextInt(45) + 1; //0~44 ==> 1 ~ 45
            int x = r.nextInt(45) + 1;
            for(int x2 : lotto) { //배열안에 동일한 값이 이미 있는지 비교하는 반복문.
                if(x == x2) {
                    break;
                }
                lotto[i] = x;
            }
        }


       System.out.println(Arrays.toString(lotto));




    }
}