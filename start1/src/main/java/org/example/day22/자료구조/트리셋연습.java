package org.example.day22.자료구조;

import java.util.Collections;
import java.util.TreeSet;

public class 트리셋연습 {
    public static void main(String[] args) {
        //TreeSet<Integer> n = new TreeSet<>(); //오름차순 자동정렬
        //treeSet(비선형, 중복x + 정렬까지
        TreeSet<Integer> n = new TreeSet<>(Collections.reverseOrder()); //내림차순 자동정렬

        n.add(1);
        n.add(2);
        System.out.println(n);
    }
}
