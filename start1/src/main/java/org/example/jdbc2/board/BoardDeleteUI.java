package org.example.jdbc2.board;

import java.util.Scanner;

public class BoardDeleteUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no입력>> ");
        int no값 = sc.nextInt(); //apple
        sc.close();

        //Board 테이블에 연결해서 입력받은 데이터를 주고 delete 해달라고 부르자.(호출하자)
        //BoardDAO 클래스 사용해서 delete()호출!
        BoardDAO dao = new BoardDAO();
        dao.delete(no값);
    }
}
