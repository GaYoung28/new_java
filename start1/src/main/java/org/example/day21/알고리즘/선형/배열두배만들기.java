package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 배열두배만들기 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        int[] numbers = {1,2,3,4,5};
        int[] answer = s.solution(numbers);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution6 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = 2 * numbers[i];
        }
        return answer;
    }
}
