package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 심화문제Q2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);

        Font font = new Font("궁서", Font.BOLD, 20);
        FlowLayout layout = new FlowLayout();
        f.setLayout(layout);

        JButton b1 = new JButton();
        JButton b2 = new JButton();

        JLabel l1 = new JLabel();
        l1.setText("게임을 계속 하시겠습니까?");
        l1.setFont(font);



    }
}
