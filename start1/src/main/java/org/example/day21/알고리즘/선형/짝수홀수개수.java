package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 짝수홀수개수 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        Solution2 s = new Solution2();
        int[] answer = s.solution(num_list); //주소, 100번
        System.out.println(Arrays.toString(answer));
    }
}


class Solution2 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; //{0,0}으로 초기화 되어있음.
//        answer[0]  //짝수개수, 누적공간
//        answer[1]  //홀수개수, 누적공간

        for (int x : num_list) { //인덱스 필요없을 때는 for-each로
            if (x % 2 == 0) {
                answer[0]++;
            }
            else {
                answer[1]++;
            }
        }
        return answer;
    }
}