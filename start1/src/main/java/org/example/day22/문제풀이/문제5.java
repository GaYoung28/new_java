package org.example.day22.문제풀이;

import java.util.HashMap;

public class 문제5 {
    public static void main(String[] args) {
        //5. String s5 = "감고나무감나무신세계신"; 각 글자가 몇 번 나왔는지 프린트
        //   (HashMap을 이용해서 푸세요.)

        String s5 = "감고나무감나무신세계신";

        char[] c = s5.toCharArray();
        HashMap<String,Integer> count = new HashMap<>();

        for (int i = 0; i < c.length; i++) {
            String s = String.valueOf(c[i]);
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        System.out.println(count);


    }
}
