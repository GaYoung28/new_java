package org.example.day22.문제풀이;

import java.util.Arrays;

public class 문제6 {
    public static void main(String[] args) {
        //6. int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        //   int[] s6 = new int[s5.length];
        //   s5의 원소들을 s6으로 역순으로 옮겨 프린트

        int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        int[] s6 = new int[s5.length];

        int j = s5.length - 1;
        for (int i = 0; i < s5.length; i++) {
            s6[j] = s5[i];
            j--;
        }
        System.out.println(Arrays.toString(s6));
    }
}
