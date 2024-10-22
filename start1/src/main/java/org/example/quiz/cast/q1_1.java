package org.example.quiz.cast;

import java.util.ArrayList;

public class q1_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("박소정");
        list.add("김경민");
        list.add("소지현");
        list.add("김개빈");
        System.out.println("초기 참가자 목록 : " + list);

        list.remove(1);
        System.out.println("탈락 후 참가자 목록 : " + list);

        System.out.println("1등 :" + list.get(0));
        System.out.println("2등 :" + list.get(1));
        System.out.println("3등 :" + list.get(2));

    }
}
