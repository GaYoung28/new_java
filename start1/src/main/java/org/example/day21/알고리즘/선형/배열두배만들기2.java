package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열두배만들기2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        //int[] answer = null;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                list.add(numbers[i] * 10);
            }
        }
        System.out.println(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
    }
}
