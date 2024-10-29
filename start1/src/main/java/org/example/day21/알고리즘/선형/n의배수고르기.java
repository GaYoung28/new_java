package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class n의배수고르기 {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        //numlist를 하나씩 꺼내서 n의 배수가 아닌지 체크해야함.
        //아닌것들만 모으자.!(가변) --> ArrayList 필요
        //결과는 int[] answer에 모아서 리턴
        int[] answer = s.solution(n, numlist);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution7 {
    public int[] solution(int n, int[] numlist) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int x : numlist) {
            if(x % n == 0) {
                list.add(x);
            }
        }
        //컬렉션 sort (오름차순, 내림차순)
        Collections.sort(list); //오름차순
        Collections.reverse(list); //내림차순


        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
