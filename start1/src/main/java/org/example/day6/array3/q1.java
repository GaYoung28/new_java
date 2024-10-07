package org.example.day6.array3;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        String[] name = {"Quiet Place", "Avengers: Endgame", "Inception", "Parasite", "Interstellar"};
        int[] view = {15000, 23000, 18000, 21000, 19000};
        System.out.println("네이버 시리즈온 실시간 영화 목록: ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + " - 조회수: " + view[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5) : ");
        int n = sc.nextInt();
        System.out.println("선택한 영화: " + name[n-1]);
        System.out.println("조회수 : " + view[n-1]);

        sc.close();
    }
}
