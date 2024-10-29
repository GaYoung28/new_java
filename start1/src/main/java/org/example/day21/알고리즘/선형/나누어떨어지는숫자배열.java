package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[] arr = {5,9,7,10};
        int divisor = 5;
        int[] answer = s.solution(arr, divisor);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution4 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = null;
        // 가변길이 -> list로 모으자
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            if (x % divisor == 0) {
                list.add(x);
            }
        }
        //System.out.println(list);
        //없으면 배열의 길이를 1로 만들어서 -1을 넣음
        //있으면 배열의 길이를 list.size()만큼 만들어서 list의 값을 배열로 옮겨야함.

        // Collections.sort(list); --> 컬렉션 오름차순

        int size = list.size();
        if (size == 0) { //배수가 하나도 없을 때
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[size];
            //list로 있는 것을 배열로 옮겨야함.
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}