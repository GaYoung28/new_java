package org.example.day9.uml문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        item1.name = "Burger";
        item1.price = 5.99;

        item2.name = "Fries";
        item2.price = 8.99;

        item3.name = "soda";
        item3.price = 1.99;

        Scanner sc = new Scanner(System.in);

        System.out.println("메뉴 번호를 입력, 3개 모두 주문 완료되었으면 'x'입력 >> ");

        Item[] items = {item1, item2, item3};

        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + "->" + items[i].getName() + ":" + items[i].getPrice());
        }

        String num = sc.nextLine(); //"1 2 3"
        String s[] = num.split(" "); // {"1", "2", "3"}

        System.out.println("Your order :");
        for (int i = 0; i < items.length; i++) {
            int s2 = Integer.parseInt(s[i]); // "1"은 string 형태이므로 integer 사용해서 int로 바꿔줌
            System.out.println(items[s2-1].getName() + " : " + items[s2-1].getPrice());
        }
        sc.close();
    }
}




