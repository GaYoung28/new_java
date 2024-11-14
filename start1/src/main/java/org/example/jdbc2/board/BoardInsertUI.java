package org.example.jdbc2.board;

import java.util.Scanner;

public class BoardInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no입력>> ");
        int no값 = sc.nextInt(); //apple
        System.out.print("title입력>> ");
        String title값 = sc.next(); //1234
        System.out.print("content입력>> ");
        String content값 = sc.next(); //apple
        System.out.print("writer입력>> ");
        String writer값 = sc.next(); //1111
        sc.close();

        //Board 테이블에 연결해서 입력받은 데이터를 주고 insert 해달라고 부르자.(호출하자)
        //BoardDAO 클래스 사용해서 insert()호출!
        BoardDAO dao = new BoardDAO();
        dao.insert(no값, title값, content값, writer값);
    }
}
