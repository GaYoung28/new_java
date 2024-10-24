package org.example.day18.디자인패턴;

import java.util.Scanner;

public class 객체생성공장사용 {
    public static void main(String[] args) {
        객체생성공장클래스 factory = new 객체생성공장클래스();
        factory.getInstance("apple");
        factory.getInstance("banana");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("어떤 객체를 생성하시겠습니까? (apple, banana) : ");
            String user = scanner.next();

            if (user.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            Object obj = factory.getInstance(user);
            if (obj == null) {
                System.out.println("유효하지 않은 입력입니다. 다시 시도해주세요.");
            } else {
                System.out.println(user + "가 입력되었습니다.\n");
            }
        }
        scanner.close();
    }
}
