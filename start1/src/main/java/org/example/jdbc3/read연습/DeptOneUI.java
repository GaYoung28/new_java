package org.example.jdbc3.read연습;

import org.example.jdbc2.dept.DeptVO;

import javax.swing.*;
import java.util.Scanner;

public class DeptOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 deptno>> ");
        int deptno = sc.nextInt();

        DeptDAO dao = new DeptDAO();
        DeptVO bag = dao.one(deptno);
        String total = bag.getDEPTNO() + " " + bag.getDNAME() + " " + bag.getLOC();
        JOptionPane.showMessageDialog(null, total);
        sc.close();
    }
}
