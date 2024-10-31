package org.example.day22.문제풀이;

import java.util.TreeSet;

public class 문제3 {
    public static void main(String[] args) {
        //3. TreeSet을 이용해서 푸세요.
        //   int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3}을 중복을 제거후 오름차순으로
        //   정렬 후 가장 큰 값과 가장 작은 값을 출력하세요.

        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3};
        TreeSet<Integer> a = new TreeSet<>();
        for (int i = 0; i < s3.length; i++) {
            a.add(s3[i]);
        }

        System.out.println(a);
        System.out.println(a.first());
        System.out.println(a.last());

    }
}
