package org.example.quiz.array;

import java.util.Arrays;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        //1. 두 개의 정수 배열을 생성하여 각각 출력
        //첫 번째 배열은 1에서 50 사이의 랜덤 값 10개
        //두 번째 배열은 51에서 100 사이의 랜덤 값 10개

        int[] n1 = new int[10];
        int[] n2 = new int[10];

        Random r = new Random();
        for (int i = 0; i < n1.length; i++) {
            n1[i] = r.nextInt(50) + 1;
            n2[i] = r.nextInt(100) + 51;
        }
        System.out.println("배열 1: " + Arrays.toString(n1));
        System.out.println("배열 2 : " + Arrays.toString(n2));

        Arrays.sort(n1);
        Arrays.sort(n2);

        int max = n1[(n1.length)-1] + n2[(n2.length)-1] ;
        System.out.println(max);

        int min = n1[0] + n2[0];
        System.out.println(min);








        /*
        int[] n1 = new int[10];
        int[] n2 = new int[10];

        Random r = new Random();
        for (int i = 0; i < n1.length; i++) {
            n1[i] = r.nextInt(50) + 1;
            n2[i] = r.nextInt(50) + 51;
        }
        System.out.println("배열1 : " + Arrays.toString(n1));
        System.out.println("배열2 : " + Arrays.toString(n2));

        //2. 첫 번째 배열과 두 번째 배열을 각각 오름차순으로 정렬

        Arrays.sort(n1);
        Arrays.sort(n2);

        //3. 두 배열에서 각각 가장 큰 값들을 더한 결과값 출력
        System.out.println(n1[(n1.length)-1] + n2[(n2.length)-1]);


        //4. 두 배열에서 각각 가장 작은 값들을 더한 결과값 출력
        System.out.println(n1[0] + n2[0]);

         */




    }


}
