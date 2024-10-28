package org.example.day20.알고리즘.문제;

public class Q5 {
    //중복된 숫자 개수(p.130)

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {0, 2, 3, 4};
        int n = 1;
        int answer = solution.solution(array, n);
        System.out.println(answer);
    }
}
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0; //1이 몇개인지 카운트
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        return answer;
    }
}
