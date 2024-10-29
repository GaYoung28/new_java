package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 아이스아메리카노 {
    public static void main(String[] args) {
        int money = 15000;
        Solution s = new Solution();
        int[] answer = s.solution(money); //int[]로 받아야함.
        System.out.println(Arrays.toString(answer));
    }
}


class Solution {
    public int[] solution(int money) { //int[]로 리턴, 입력 int
        int[] answer = new int[2];
        answer[0] = money / 5500 ; //잔수 계산
        answer[1] = money % 5500;  //잔돈 계산
        return answer;
    }
}