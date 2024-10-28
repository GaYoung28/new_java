package org.example.day20.알고리즘;

public class n의배수 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int num = 98;
        int n = 2;
        //98이 2의 배수이면 1, 아니면 0 리턴
        int answer = solution2.solution(num,n);
        System.out.println(answer);
    }
}

class Solution2 {
    public int solution(int num, int n) {
        int answer = 0;

        if (num % n == 0) {
            answer = 1;
        }
        return answer;
    }
}


