package org.example;

import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        String a1 = JOptionPane.showInputDialog("첫 번째 수학 점수를 입력하세요.");
        String a2 = JOptionPane.showInputDialog("두 번째 수학 점수를 입력하세요.");
        String b1 = JOptionPane.showInputDialog("첫 번째 영어 점수를 입력하세요.");
        String b2 = JOptionPane.showInputDialog("두 번째 영어 점수를 입력하세요.");

        int c1 = Integer.parseInt(a1);
        int c2 = Integer.parseInt(a2);
        int c3 = Integer.parseInt(b1);
        int c4 = Integer.parseInt(b2);

        int sum1 = c1 + c2;
        int sum2 = c3 + c4;

        double avg1 = (double) sum1 / 2;
        double avg2 = (double) sum2 / 2;


        JOptionPane.showMessageDialog(null,"수학 평균 점수 :  " + avg1 + "\n영어 평균 점수 :  " + avg2);







    }
}
