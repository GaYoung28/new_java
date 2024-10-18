package org.example.quiz.static문제.q2;

public class Day사용 {
    public static void main(String[] args) {
        Day day1 = new Day("자바공부", 10, "강남");
        Day day2 = new Day("여행", 15, "강원도");
        Day day3 = new Day("운동", 11, "피트니스");
        System.out.println(Day.total);
        System.out.println(Day.total/3);
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);

    }
}
