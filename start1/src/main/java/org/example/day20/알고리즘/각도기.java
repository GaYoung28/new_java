package org.example.day20.알고리즘;

public class 각도기 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        int angle = 180;
        int answer = solution8.solution(angle);
        System.out.println(answer);

    }
}

class Solution8 {
    public int solution(int angle) {
        int answer = 0;

        if (0<angle && angle< 90) {
            answer = 1;
        } else if (angle==90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}
