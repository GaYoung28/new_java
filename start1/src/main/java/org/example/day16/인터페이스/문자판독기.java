package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 문자판독기 {
    public static void main(String[] args) {
        JFrame f = new JFrame("문자판독기");
        f.setSize(500,300);
        f.setLayout(new FlowLayout());
        f.getContentPane().setBackground(Color.gray);

        Font font = new Font("굴림",Font.BOLD,40);

        JLabel label = new JLabel("문장을 넣으세요");
        f.add(label);
        label.setFont(font);

        JTextArea area =  new JTextArea(3,10);
        area.setBackground(Color.white);
        area.setLineWrap(true);
        area.setAutoscrolls(true);
        area.setFont(font);
        f.add(area);

        Font font2 = new Font("굴림",Font.BOLD,20);

        JButton b1 = new JButton("글자수/단어수");
        b1.setFont(font2);
        b1.setBackground(Color.PINK);
        f.add(b1);

        JButton b2 = new JButton("배경색변경");
        b2.setFont(font2);
        b2.setBackground(Color.PINK);
        f.add(b2);

        JButton b3 = new JButton("글자색변경");
        b3.setFont(font2);
        b3.setBackground(Color.PINK);
        f.add(b3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //area에 쓴 글자들을 가지고 와서
                //글자수와 단어수를 파악해주세요!
                //다이얼로그창에 결과를 띄우자!
                String text = area.getText();
                int length = text.replace(" ","").length();
                String[] data2 = text.split(" ");
                int count = data2.length;
                Font font = new Font("굴림",Font.BOLD,40);
                JOptionPane.showMessageDialog(f, "글자수는 " + length + "\n" + "단어수는 " + count );
            }
        });

        f.setVisible(true);
    }
}
