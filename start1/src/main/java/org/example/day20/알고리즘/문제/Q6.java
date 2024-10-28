package org.example.day20.알고리즘.문제;

public class Q6 {
    //점의 위치 구하기(p.129)

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] dot = {2,4};
        int answer = solution1.solution(dot);
        System.out.println(answer);
    }
}

class Solution1 {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }
}
