package org.example.day9.uml문제;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Item Item1 = new Item();
        Item Item2 = new Item();
        Item Item3 = new Item();

        Item1.name = "Burger";
        Item1.price = 5.99;
        Item2.name = "Fries";
        Item2.price = 2.99;
        Item3.name = "soda";
        Item3.price = 1.99;

        Scanner sc = new Scanner(System.in);
        System.out.println("다음 메뉴 중 3번 주문하세요. (번호입력 : 주문, 주문완료 : 'x'입력");

        Item[] items = {Item1, Item2, Item3};
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ">>" + items[i].name);
        }

    }
}
