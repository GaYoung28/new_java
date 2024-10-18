package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 영화예매시스템 {
    static int count = 0;
    static String sum = "";


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(560, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);//add()한 순서대로 물흐르듯이 뒤에다 붙여줌.!

       // int seats = 100;
       // boolean[] a = new boolean[seats + 1];

        for (int i = 1; i < 100; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            frame.add(button);

            //int num = i;

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //버튼 클릭했을 때 실행되는 내용!
                    //버튼 클릭하면 ActionListener 안에 있는 actionPerformed() 라는
                    //함수가 자동 실행!
                    String s = e.getActionCommand(); // 버튼 위에 있는 글자를 가지고 온다.
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s + "번 예매됨.");
                    button.setEnabled(false); // 버튼 더이상 못누르게
                    button.setBackground(Color.red); // 이미 누른 버튼은 빨간색으로
                    count++; //예매 수 카운트
                    sum = sum + s + " ";
                    //a[num] = true;
                }
            });
        }

        JButton pay = new JButton();
        pay.setText("결제하기");
        frame.add(pay);
        pay.setBackground(Color.YELLOW);

        //StringBuilder sb = new StringBuilder();

        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //for (int i = 1; i < a.length; i++) {
                  //  if (a[i]) {
                   //     sb.append(i).append(" ");
                    JOptionPane.showMessageDialog(frame,"최종 결제금액은 " + count * 10000 +"원 \n 좌석번호는 " + sum );
            }
        });
            //맨 끝!
            frame.setVisible(true);
        }
    }

