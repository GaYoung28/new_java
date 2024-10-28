package org.example.day20.알고리즘;

import java.util.Arrays;

public class 최댓값만들기2 {
    public static void main(String[] args) {
        int[] numbers ={10, 20, 30, 5, 5, 20, 5};
        Arrays.sort(numbers);

        int answer = 0;
        int post = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int pre = numbers[0] * numbers[1];
        if (post > pre) {
            answer = post;
        } else {
            answer = pre;
        }
        System.out.println(answer);
    }
}
