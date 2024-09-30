package org.example.day2.control;

import java.util.Scanner;

public class 기본문제Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("여행 지역을 입력하세요: ");
        String a = sc.next();
        System.out.print("1인당 경비를 입력하세요: ");
        double b = sc.nextDouble();
        System.out.print("여행 인원을 입력하세요: ");
        int c = sc.nextInt();
        System.out.print("할인율(%)을 입력하세요: ");
        double d = sc.nextDouble();
        System.out.print("VIP 여부(true/false)를 입력하세요: ");
        boolean e = sc.nextBoolean();
        System.out.print("당부의 말을 입력하세요: ");
        String f = sc.next();

        System.out.println("===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: " + a);
        System.out.println("1인당 경비: " + b + "원");
        System.out.println("여행 인원: " + c + "명");
        System.out.println("기본 할인율: " + d + '%');
        System.out.println("VIP 추가 할인율: " + 5 + '%');
        System.out.println("최종 할인율: " + (d + 5) + '%');
        System.out.println("총 경비 : " + b * c + "원");
        //System.out.println("할인 금액: " +  );
       // System.out.println("할인 후 총 경비 : " + );



        sc.close();
    }
}


