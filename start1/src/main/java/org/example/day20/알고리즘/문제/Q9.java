package org.example.day20.알고리즘.문제;

public class Q9 {
    // 옷가게 할인받기 (p.112)

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int price = 150000;
        int answer = solution.solution(price);
        System.out.println(answer);
    }
}

class Solution4 {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
            answer = (int)(price - price * 0.2) ; //price * 0.2는 double 값 , answer는 int값, int로 형변환
        }
        else if (price >= 300000) {
            answer = (int)(price - price * 0.1) ;
        }
        else if (price >= 100000) {
            answer = (int)(price - price * 0.05) ;
        }
        else {
            answer = price ;
        }
        return answer;
    }
}


