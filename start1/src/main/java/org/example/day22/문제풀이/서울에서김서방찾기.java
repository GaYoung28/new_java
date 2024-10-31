package org.example.day22.문제풀이;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "kim"};
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("kim")) {
                System.out.println("김서방은 " + i + "에 있다.");
            }
        }
        //binarySearch (이진검색) -> 인덱스 가져옴
        System.out.println(Arrays.binarySearch(seoul,"kim")); // 1
        System.out.println(Arrays.binarySearch(seoul,"Jane")); //0
        System.out.println(Arrays.binarySearch(seoul,"Park")); //없으면 음수값
        //3,5,7,8,1
        //1-3-5-7-8
    }
}
