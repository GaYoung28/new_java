package org.example.day20.알고리즘.문제;

public class Q7 {
    //머쓱이보다 키 큰 사람(p.127)

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] array = {180, 120, 140};
        int height = 190;
        int answer = solution.solution(array, height);
        System.out.println(answer);
    }
}

class Solution2 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }
}
