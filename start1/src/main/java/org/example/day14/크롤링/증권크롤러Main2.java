package org.example.day14.크롤링;

import javax.swing.*;

public class 증권크롤러Main2 {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code 입력");
        //005930, 035720,
        증권크롤러2 naver = new 증권크롤러2();
        try {
            String[] data = naver.crawl(code);
            //code가 035720인 회사의 최고가는 37000이고,
            //전일가는 35000이다.
            //JOptionPane.showMessageDialog("code가" +)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
