package org.example.jdbc4.one;

import java.sql.*;
import java.util.ArrayList;

public class DeptDAO {
    Connection con;
    //jdbc 4단계
    public DeptDAO() throws ClassNotFoundException, SQLException {
        //객체 생성시 1-2단계를 실행하게 하자.
        //CRUD 할 때 모두 동일하므로
        //생성자메서드는 객체 생성시 꼭 해주어야 하는
        //작업을 작성하는 메서드(멤버변수 초기화같은 작업)

        //1. 드라이버설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");

        //2. db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url,id,pw);
        System.out.println("2. db연결 성공!");
    }

    //CRUD 기능별 메서드를 추가하면 됨
    //각각의 메서드에는 jdbc 3-4단계만 넣음.!
    //read(select문 작업, 검색(읽기))
    //검색결과가 row 1개, row 여러 개일때마다 작업이 약간 다름
    //one(int deptno), list()

    public DeptVO one(int deptno) throws SQLException {
        //검색결과가 row개 --- 가방(vo)에 컬럼값 다 넣어서 전달 ---> ui
        DeptVO bag = new DeptVO();
        //3단계
        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,deptno);
        //4단계
        //테이블형태로 검색결과가 와야하므로, executeQuery()
        ResultSet rs = ps.executeQuery(); //컬럼 + 값들(row)
        if(rs.next()) { //true
            //있으면 row에 있는 값들을 꺼내어 vo에 넣자.
            //ORM
            bag.setDeptno(rs.getInt("deptno"));
            bag.setDname(rs.getString("dname"));
            bag.setLoc(rs.getString("loc"));

            //db의 인덱스는 1부터 시작
        }
        return bag;
    }

    public ArrayList<DeptVO> list() throws SQLException {
        //row하나당 가방(vo)하나 필요함.
        //row 5개이면 가방(vo) 5개 필요함.
        //ui에 가방 5개 리턴해서 전달하려면 묶어주어야함.
        //--> 자바에서는 리턴할 때 무조건!! 하나로 묶어서 해야함.
        //가방을 묶어줄 용도로 사용하는 것이 List타입의 객체(ArrayList)를 사용함.
        ArrayList<DeptVO> list = new ArrayList<>();
        String sql = "select * from dept";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while(rs.next()) { //없다고 할 때까지(false) 반복!
            DeptVO bag = new DeptVO();
            bag.setDeptno(rs.getInt("deptno"));
            bag.setDname(rs.getString("dname"));
            bag.setLoc(rs.getString("loc"));
            list.add(bag);
        }
        return list;
    }
}
