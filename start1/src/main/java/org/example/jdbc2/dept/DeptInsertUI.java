package org.example.jdbc2.dept;

import java.util.Scanner;

public class DeptInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("DEPTNO입력>> ");
        int deptno = sc.nextInt(); //apple
        System.out.print("DNAME입력>> ");
        String dname = sc.next(); //1234
        System.out.print("LOC입력>> ");
        String loc = sc.next(); //apple
        sc.close();

        DeptDAO dao = new DeptDAO();
        DeptVO vo = new DeptVO();
        vo.setDEPTNO(deptno);
        vo.setDNAME(dname);
        vo.setLOC(loc);
        dao.insert(vo);
    }
}
