package org.example.day5.array2;

import java.util.Arrays;

public class 참조형복사2 {
    public static void main(String[] args) {
        // 배열 복사 방법
        // 1) clone() 사용

        int[]term1 = {100, 200, 300};
        int[]term2 = term1.clone();
        term2[0] = 96;
        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));
        System.out.println(term1 + " " + term2);

        //배열의 깊은 복사
        String[] name = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] score1 = {44,66,22,99,100};
        int[] score2 = score1.clone();
        score2[0] = 22;
        score2[2] = 88;
        System.out.println(Arrays.toString(score1));
        System.out.println(Arrays.toString(score2));

        //동일과목 수
        int count = 0;
        for (int i = 0; i < score1.length; i++) {
            if (score1[i] == score2[i]) {
                count++;
            }
        }
            System.out.println("동일과목 수 : " + count + "개");

        //오른 과목 수
        int count2 = 0;
        int index = 0;
        for (int i = 0; i < score2.length; i++) {
            if (score2[i] > score1[i]) {
                count2++;
                index = i;
            }
        }
        System.out.println("오른 과목 수 : " + count2 + "개");
        System.out.println("오른 과목명 : " + name[index]);










    }
}
