package org.example.jdbc4.연습;

import java.sql.SQLException;
import java.util.ArrayList;

public class DeptListUI2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeptDAO2 dao = new DeptDAO2();
        ArrayList<DeptVO2> list = dao.list();
        for (DeptVO2 bag : list) {
            System.out.println(bag.getDeptno());
            System.out.println(bag.getDname());
            System.out.println(bag.getLoc());
            System.out.println("-------------------------");

        }
    }
}
