package org.example.jdbc2.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeptDAO {
    Connection con; //전역변수가 됨, null로 초기화!

    public DeptDAO() throws Exception {
        //new MemberDAO()할 때 클래스이름과 동일한 메서드인 생성자메서드가 자동호출됨.(1-2단계를 실행해줌)
        //1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");

        //2. db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";

        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }


    public void insert(DeptVO vo) throws Exception {
        //3. sql 준비 --> sql객체
        String sql = "insert into dept2 values(?,?,?)";
        //insert into member values ('apple','1234', ...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, vo.getDEPTNO()); //1은 ?번호
        ps.setString(2, vo.getDNAME());
        ps.setString(3, vo.getLOC());
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql 전송 --> ps가 전송하는 기능을 가지고 있음
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row 수 --> " + result);

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }

    public void update (DeptVO vo) throws Exception {
        String sql = "update dept2 set deptno=?,dname=? where loc=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, vo.getDEPTNO());
        ps.setString(2, vo.getDNAME());
        ps.setString(3, vo.getLOC());
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql 전송 --> ps가 전송하는 기능을 가지고 있음
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row 수 --> " + result);

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!



    }
}
