package com.example;

import java.util.Arrays;
import java.util.Random;

public class basic_q1_array2 {
        public static void main(String[] args) {
           // Random rand = new Random();
            //int[] arr = new int[20];
            //for (int i = 0; i < arr.length; i++) {
             //   arr[i] = rand.nextInt(100) + 1;


            Random r = new Random();
            int [] a = new int [20];
            for(int i = 0; i < a.length; i++) {
                a[i] = r.nextInt(100) ;

            }
            System.out.println("배열 프린트: " + Arrays.toString(a));



        }
    }
