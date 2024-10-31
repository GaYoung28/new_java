package org.example.day22.문제풀이;

import java.util.HashMap;

public class 문제2 {
    public static void main(String[] args) {
        //2. HashMap을 이용해서 푸세요.
        //   String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
        //   밥과 커피먹은 횟수 구하여 출력
        //   밥을 더 많이 먹었으면 "밥을 더 먹었군요"
        //   커피를 더 많이 마셨으면 "커피를 더 마셨군요"

        String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
        HashMap<String,Integer> count = new HashMap<>();
        for(String x : s2) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        System.out.println(count);
        int a = count.get("밥");
        int b = count.get("커피");

        System.out.println(a);
        System.out.println(b);

        if (a > b) {
            System.out.println("밥을 더 먹었군요");
        } else if (a < b){
            System.out.println("커피를 더 마셨군요");
        }



    }


}
