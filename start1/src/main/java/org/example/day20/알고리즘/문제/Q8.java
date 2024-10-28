package org.example.day20.알고리즘.문제;

public class Q8 {
    // 배열의 평균값 (p.115)

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double answer = solution3.solution(numbers);
        System.out.println(answer);
    }
}

class Solution3 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum / numbers.length;
        return answer;

    }
}
