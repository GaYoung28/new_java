package org.example.day20.알고리즘;

public class 양꼬치 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        int n = 64;
        int k = 6;
        int answer = solution9.solution(n, k);
        System.out.println(answer);
    }

}

class Solution9 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = n * 12000 + k * 2000 - (n / 10) * 2000;
        return answer;
    }
}
