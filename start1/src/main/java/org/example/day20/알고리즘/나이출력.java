package org.example.day20.알고리즘;

public class 나이출력 {
    public static void main(String[] args) {
    Solution5 solution5 = new Solution5();
    int age = 23;
    int answer = solution5.solution(age);
        System.out.println(answer);
    }
}

class Solution5 {
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}
