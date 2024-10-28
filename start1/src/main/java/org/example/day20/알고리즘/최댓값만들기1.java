package org.example.day20.알고리즘;

import java.util.Arrays;

public class 최댓값만들기1 {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        int[] numbers = { 1, 2, 3, 4, 5};
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        System.out.println(answer);
    }
}

class Solution13 {
    public int solution(int[] numbers) {
        int answer = 0;
        //정렬한 후
        //맨 끝값 * 두번째 끝값
        return answer;
    }
}