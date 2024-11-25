package org.example.jdbc4.연습;

import java.sql.SQLException;

public class DeptOneUI2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeptDAO2 dao = new DeptDAO2();
        DeptVO2 bag = dao.one(1);
        System.out.println(bag.getDeptno());
        System.out.println(bag.getDname());
        System.out.println(bag.getLoc());

    }
}
