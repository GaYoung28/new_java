package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        JFrame f = new JFrame(); //주소
        JButton b1 = new JButton(); //버튼 만들기

        f.setSize(500, 500);
        f.setTitle("부품사용연습");

        b1.setText("button");
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.YELLOW);

        Font font = new Font("궁서", Font.ITALIC, 30);
        b1.setFont(font);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        f.add(b1);

        f.setVisible(true);





    }
}
