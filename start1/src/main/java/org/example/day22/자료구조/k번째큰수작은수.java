package org.example.day22.자료구조;

import java.util.Arrays;
import java.util.TreeSet;

public class k번째큰수작은수 {
    public static void main(String[] args) {
        int[] n = {1, 12, 33, 6, 18, 9, 10, 10};
        TreeSet<Integer> treeSet = new TreeSet<>(); //중복 x, 정렬해줌
        for (int x : n) {
            treeSet.add(x);
        }
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        //treeset을 배열로 변경
        Object[] arr = treeSet.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
        System.out.println(arr[arr.length - 3]);

        // k번째 큰 수라고 나오면 정렬된 상태에서
        // arr[arr.length - k]
    }
}
