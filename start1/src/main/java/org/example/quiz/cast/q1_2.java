package org.example.quiz.cast;

import java.util.LinkedList;

public class q1_2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("국어");
        list.add("수학");
        list.add("영어");
        list.add("컴퓨터");
        System.out.println("처음 시험별 과목 : " + list);

        list.remove(0);
        System.out.println("1회차 시험을 한 날은 과목 : " + list);

        list.removeFirst();
        System.out.println("2회차 시험을 한 날은 과목 : " + list);

        list.removeFirst();
        System.out.println("3회차 시험을 한 날은 과목 : " + list);

    }
}
