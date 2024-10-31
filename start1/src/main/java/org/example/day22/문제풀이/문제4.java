package org.example.day22.문제풀이;

import java.util.Arrays;
import java.util.TreeSet;

public class 문제4 {
    public static void main(String[] args) {
        //4. int[] s4 = {11, 3, 78, 9, 2, 100} 오름차순 정렬 후
        //   2번째 큰 값과 2번째 작은 값을 구하세요.

        int[] s4 = {11, 3, 78, 9, 2, 100} ;
        TreeSet<Integer> a = new TreeSet<>();
        for (int i = 0; i < s4.length; i++) {
            a.add(s4[i]);
        }

        Object[] arr = a.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 2]);
        System.out.println(arr[1]);

    }
}
