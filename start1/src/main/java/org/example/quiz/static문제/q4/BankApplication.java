package org.example.quiz.static문제.q4;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accounts = new Account[3];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("은행 게좌 관리 애플리케이션");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 목록보기");
            System.out.println("3. 계좌 정보검색");
            System.out.println("4. 계좌 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("메뉴를 선택하세요 : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count > 3) {
                        System.out.println("더이상 계좌를 생성할 수 없습니다.");
                    }
                    sc.nextLine();
                    System.out.println("새 계좌 정보를 입력하세요.(형식: 계좌번호 소유자 잔액)");
                    String[] input = sc.nextLine().split(" ");
                    int accountId = Integer.parseInt(input[0]);
                    String accountName = input[1];
                    int balance = Integer.parseInt(input[2]);
                    Account account = new Account(accountId, accountName, balance);

                    accounts[count++] = account;

                    System.out.println("계좌가 생성되었습니다.");
                    break;
                case 2:
                    System.out.println("저장된 모든 계좌 정보를 출력합니다.");
                    for (int i = 0; i < count; i++) {
                        System.out.println(accounts[i]);
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("검색할 계좌번호를 입력하세요 : ");
                    int num = Integer.parseInt(sc.nextLine());

                    boolean isTrue = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i]!= null && num == accounts[i].getAccountId()) {
                            System.out.println(accounts[i]);
                            isTrue = true;
                        }
                        if (!isTrue) {
                            System.out.println("일치하는 계좌번호가 없습니다.");
                        }
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("삭제할 계좌번호를 입력하세요 : ");
                    int num1 = Integer.parseInt(sc.nextLine());

                    boolean isTrue1 = false;

                    for (int i = 0; i < count; i++) {
                        if (num1 == accounts[i].getAccountId()) {
                            accounts[i] = null;
                            System.out.println("계좌가 삭제되었습니다.");
                            isTrue1 = true;
                        }
                        if (!isTrue1) {
                            System.out.println("일치하는 계좌번호가 없습니다.");
                        }
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("정말 종료하시겠습니까? (Y/N)");
                    char ch = sc.next().charAt(0);
                    if (ch == 'Y') {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    break;

            }
        }

    }
}
