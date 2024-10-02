package org.example.day5.array2;

import java.util.Scanner;

public class 인기투표 {
    public static void main(String[] args) {
        //이름 배열
        String[] name = {"아이유", "유재석", "방탄"};
        //투표수 배열
        int[] tv = new int[3];

        Scanner sc = new Scanner(System.in); //자바코드 <- 연결스트림 오픈 -> 콘솔
        while(true) {
            System.out.println("인기투표  1)아이유  2)유재석  3)방탄  4)종료");
            System.out.print("선택번호>> ");
            int num = sc.nextInt();
            // 무한루프인 경우 종료시점 반드시 명시

            if (num == 4) {
                System.out.println("종료합니다.");
                System.out.println("아이유: " + tv[0] + "표");
                System.out.println("유재석: " + tv[1] + "표");
                System.out.println("방탄: " + tv[2] + "표") ;
                System.out.println("전체 투표수: " + (tv[0] + tv[1] + tv[2])); //하나라도 String이면 총 결과가 String으로 찍힘.
                // 계산 먼저 해야하므로 괄호 필수
                break; //투표종료!
            }
            //종료시점 아래에 구체적인 조건 처리 넣어주세요

            switch (num) {
                case 1:
                    tv[0] ++;
                    System.out.println("아이유 선택하셨군요.!");
                    break;
                case 2:
                    tv[1] ++;
                    System.out.println("유재석 선택하셨군요.!");
                    break;
                case 3:
                    tv[2] ++;
                    System.out.println("방탄 선택하셨군요.!");
                    break;
                default:
                    System.out.println("틀린번호를 선택하셨군요.!");
            }
        }
        sc.close();



    }
}
