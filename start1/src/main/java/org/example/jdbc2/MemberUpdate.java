package org.example.jdbc2;

import java.util.Scanner;

public class MemberUpdate {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("tel입력>> ");
        String tel값 = sc.next(); //999
        System.out.print("id입력>> ");
        String id값 = sc.next(); //ice
        sc.close();


        //Member 테이블에 연결해서 입력받은 데이터를 주고 update 해달라고 부르자.(호출하자)
        //MemberDAO 클래스 사용해서 update()호출!
        MemberDAO dao = new MemberDAO();
        dao.update(id값,tel값);
    }
}
