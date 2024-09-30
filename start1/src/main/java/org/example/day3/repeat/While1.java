package org.example.day3.repeat;

import java.util.Date;

public class While1 {
    public static void main(String[] args) {
        //유한반복 ==> 시작값, 조건, 증감값
        int i = 1; //시작값
        while (i <= 10) { //조건
            System.out.println(i);
            i++; // i = i + 1; --> 증감값

        } //while 문 닫음


        System.out.println("------------");
        for (int j=1; j<=10; j++) {
            System.out.println(j);

        } //for 문

        System.out.println("------------");
        //무한반복 , while문은 종료시점 명시해줘야 함
        while(true) { //while 문 뒤에는 항상 조건 ==> boolean(논리형 데이터) 결과
            System.out.println("내가 계속 돌아.");

        //초 구해서 50초 이상되면 멈추게
            Date date = new Date();
            int seconds = date.getSeconds();
            if(seconds>50) {
                break;
            }
        }

    } //main
}//class
