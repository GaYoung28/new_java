package org.example.day20.알고리즘;

public class 숫자비교하기 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int num1 = 11;
        int num2 = 11;
        int answer = solution4.solution(num1, num2);
        System.out.println(answer);

    }
}
class Solution4 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}
