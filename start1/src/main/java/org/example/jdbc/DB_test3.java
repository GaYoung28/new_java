package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DB_test3 {
    //DB처리만 담당하는 클래스 Data Access Object(DAO)
    public static void main(String[] args) throws Exception {
        //자바(언어)에서 db를 연결하는 프로그램 4단계
        //java DB Connectivity(JDBC) 4단계

        //1단계 - 사용할 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1단계 드라이버 설정 성공!");

        //2단계 - db연결 --> 데이터~!(실무 설정)
        String url = "jdbc:mysql://localhost:3306/shop2"; //ip+port+db명
        String id = "root";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, id, pw);
        System.out.println("2단계 shop2 db연결 성공!");

        //입력받는 부분(UI)
        Scanner sc = new Scanner(System.in); //콘솔과 연결통로 생성.
        System.out.println("아이디 입력>> ");
        String id값 = sc.next();
        System.out.println("이름 입력>> ");
        String name값 = sc.next();
        sc.close(); //콘솔과 연결통로 닫음.

        //3단계 - sql 작성
        String sql = "insert into test values (?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,id값);
        ps.setString(2,name값);
        System.out.println("3단계 sql문 객체화 성공!");

        //4단계 - dbms로 sql문 전송
        int result = ps.executeUpdate(); //sql 전송 후 결과 받아온다.
        System.out.println("4단계 sql문 전송 성공!");
        System.out.println("처리된 row수 " + result);

    }
}
