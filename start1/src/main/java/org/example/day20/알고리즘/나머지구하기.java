package org.example.day20.알고리즘;

public class 나머지구하기 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int num1 = 10;
        int num2 = 5;
        int answer = solution3.solution(num1, num2);
        System.out.println(answer);

    }
}

class Solution3 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }
}
