package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Dept2Update {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. MYSQL 자바 연결할 부품 설정 성공.");

        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url,id,pw);
        System.out.println("2. MYSQL 연결 성공.");

        Scanner sc = new Scanner(System.in);
        System.out.println("deptNo>> ");
        String deptNo = sc.next();
        System.out.println("loc>> ");
        String loc = sc.next();
        sc.close();

        String sql = "update dept2 set loc = ? where deptNo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,loc);
        ps.setString(2,deptNo);
        System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

        ps.executeUpdate();
        System.out.println("4. SQL문 MYSQL로 보내기 성공");
        System.out.println("수정 성공");
    }
}
