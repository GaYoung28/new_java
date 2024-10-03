package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class basic_q1_array {
        public static void main(String[] args) {

            Random rand = new Random();
            int[] arr = new int[20];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100) + 1;
            }

            System.out.println("배열 프린트: " + Arrays.toString(arr));


            Arrays.sort(arr);
            System.out.println("오름차순 정렬 후 프린트: " + Arrays.toString(arr));

            System.out.println("MAX: " + arr[arr.length - 1]);
            System.out.println("MIN: " + arr[0]);
        }
    }
