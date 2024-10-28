package org.example.day20.알고리즘;

public class 피자나눠먹기3 {
    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        int slice = 4;
        int n = 12;
        int answer = solution.solution(slice, n);
        System.out.println(answer);
    }
}

class Solution11 {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n % slice == 0) {
            answer = n / slice;
        }
        else {
            answer = n / slice + 1;
        }
        return answer;
    }
}