package org.example.day2.control;

import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {
        //수동 import ==> alt + 엔터
        Scanner sc = new Scanner(System.in);
        // 정수 2개를 입력받아서 첫번째 숫자가 두번째 숫자보다 큰지 비교해서 출력
        System.out.print("숫자1 입력>> ");
        int a = sc.nextInt();
        System.out.print("숫자2 입력>> ");
        int b = sc.nextInt();

        System.out.println();



        sc.close();
    }
}


