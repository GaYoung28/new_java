package org.example.day5.array2;

import java.util.Arrays;

public class 참조형복사 {
    public static void main(String[] args) {
        int[]term1 = {100, 200, 300};
        int[]term2 = term1;
        term2[0] = 96;
        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));


        // ====> 값이 안바뀜 -> 배열은 기본형처럼 복사하면 안됨.
    }
}
