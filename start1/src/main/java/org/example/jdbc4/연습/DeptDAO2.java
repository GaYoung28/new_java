package org.example.jdbc4.연습;

import java.sql.*;
import java.util.ArrayList;

public class DeptDAO2 {
    Connection con;
    public DeptDAO2() throws ClassNotFoundException, SQLException {
        //1.
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url,id,pw);
    }

    public DeptVO2 one(int deptno) throws SQLException {
        DeptVO2 bag = new DeptVO2();
        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,deptno);

        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            bag.setDeptno(rs.getInt("deptno"));
            bag.setDname(rs.getString("dname"));
            bag.setLoc(rs.getString("loc"));
        }
        return bag;
    }

    public ArrayList<DeptVO2> list() throws SQLException {
        ArrayList<DeptVO2> list = new ArrayList<>();
        String sql = "select * from dept";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            DeptVO2 bag = new DeptVO2();
            bag.setDeptno(rs.getInt("deptno"));
            bag.setDname(rs.getString("dname"));
            bag.setLoc(rs.getString("loc"));
            list.add(bag);
        }
        return list;

    }
}
