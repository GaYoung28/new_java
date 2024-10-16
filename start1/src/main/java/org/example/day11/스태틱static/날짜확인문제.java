package org.example.day11.스태틱static;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 날짜확인문제 {
    public static void main(String[] args) {
        //LocalDateTime을 이용해서 현재 날짜를 구하세요.(시작일)
        //종료일을 구하세요. 2주 후 날짜를 구하세요.(종료일)

        //종료일이 시작일 후이면, 아직 대여중입니다.
        //종료일이 시작일과 동일하면, 대여 종료날입니다.

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));

        LocalDateTime end = now.plusWeeks(2);
        System.out.println(end.format(formatter));

        if(end.isAfter(now)) {
            System.out.println("아직 대여중입니다.");
        }
        else {
            System.out.println("대여를 종료합니다.");
        }
    }
}
