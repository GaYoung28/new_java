package org.example.day20.알고리즘;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int num1 = 1;
        int num2 = 16;
        int result = solution6.solution(num1, num2);
        System.out.println(result);
    }
}

class Solution6 {
    public int solution(int num1, int num2) {
        int answer = 0;
        //나누어서
        double result = (double)num1/num2; //하나라도 double이면 결과는 double
        //1000을 곱한 후
        double result1 = result * 1000;
        //정수만 리턴
        answer = (int)result1;
        return answer;
    }
}
