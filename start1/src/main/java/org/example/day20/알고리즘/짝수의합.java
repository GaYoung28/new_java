package org.example.day20.알고리즘;

public class 짝수의합 {
    public static void main(String[] args) {
    Solution7 solution7 = new Solution7();
    int n = 10;
    int answer = solution7.solution(n);
    System.out.println(answer);
    }
}

class Solution7 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++){
            if(i % 2 == 0){
                answer = answer + i;
            }
        }
        return answer;
    }
}
