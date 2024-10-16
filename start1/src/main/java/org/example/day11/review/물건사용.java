package org.example.day11.review;

public class 물건사용 {
    public static void main(String[] args) {
        물건 corn = new 물건("맛있는 찰옥수수 냉동 옥수수", "혜성식품",16000,"10/16 도착 예정",0.21);
        System.out.println("상품명 : " + corn.getName());
        System.out.println("판매자명 : " + corn.getSeller());
        System.out.println("가격 : " + corn.getPrice());
        System.out.println("도착일 : " + corn.getArrivalTime());
        System.out.println("할인가격 : " + corn.getDiscountPrice());
        System.out.println(corn);
    }
}

