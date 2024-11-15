package org.example.jdbc3.read연습;

import java.util.Scanner;

public class MemberLoginUI2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("로그인할 id>> ");
        String id = sc.next();
        System.out.print("로그인할 pw>> ");
        String pw = sc.next();

        MemberDAO2 dao = new MemberDAO2();
        //vo 쓰는 기준!!!
        //가방만들고 값넣고 전달하고

        MemberVO bag = new MemberVO();
        bag.setId(id);
        bag.setPw(pw);

        boolean result = dao.login(bag);

        if (result) {
            System.out.println("로그인 성공");
        }
        else {
            System.out.println("로그인 실패");
        }

        sc.close();



    }

}
