package com.example;

import java.util.Arrays;
import java.util.Random;

public class basic_q2_two {
    public static void main(String[] args) {
        // Step 1: 두 개의 정수 배열 생성
        Random rand = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = rand.nextInt(50) + 1;
            arr2[i] = rand.nextInt(50) + 51;
        }

        System.out.println("배열 1: " + Arrays.toString(arr1));
        System.out.println("배열 2: " + Arrays.toString(arr2));

        // Step 2: 오름차순으로 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        // Step 3: 가장 큰 값끼리 합해서 출력
        System.out.println(arr1[arr1.length-1] + arr2[arr2.length-1]);

        // Step 4: 가장 작은 값끼리 합해서 출력
        System.out.println(arr1[0] + arr2[0]);

    }
}

