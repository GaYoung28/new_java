package org.example.jdbc2.board;

import java.util.Scanner;

public class BoardUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no입력>> ");
        int no값 = sc.nextInt(); //apple
        System.out.print("content입력>> ");
        String content값 = sc.next(); //apple
        sc.close();

        //Board 테이블에 연결해서 입력받은 데이터를 주고 update 해달라고 부르자.(호출하자)
        //BoardDAO 클래스 사용해서 update()호출!
        BoardDAO dao = new BoardDAO();
        dao.update(no값, content값);
    }
}
