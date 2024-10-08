package org.example.day7.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 로그인화면 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JLabel 3개, JTextField 2개, JButton 2개
        JLabel top = new JLabel();
        top.setText("일기장");
        Font font = new Font("굴림", Font.BOLD, 90);
        top.setFont(font);

        JLabel id = new JLabel();
        id.setText("ID");
        Font font2 = new Font("굴림", Font.BOLD, 25);
        id.setFont(font2);

        JLabel pw = new JLabel();
        pw.setText("PW");
        pw.setFont(font2);

        JTextField id2 = new JTextField(10);
        JTextField pw2 = new JTextField(10);
        id2.setFont(font2);
        pw2.setFont(font2);

        JButton ok = new JButton();
        ok.setText("OK");
        ok.setFont(font2);

        JButton del = new JButton();
        del.setText("Del");
        del.setFont(font2);


        //이미지를 넣을 때는 이미지 아이콘으로 만들어서 버튼에 설정해야함.
        ImageIcon icon = new ImageIcon("ok.png");
        ok.setIcon(icon);
        ImageIcon icon2 = new ImageIcon("del.png");
        del.setIcon(icon2);


        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        id2.setBackground(Color.yellow); //배경색 설정
        pw2.setBackground(Color.yellow);
        id2.setForeground(Color.blue);
        pw2.setForeground(Color.blue);
        ok.setBackground(Color.green);
        del.setBackground(Color.green);


        frame.add(top);
        frame.add(id);
        frame.add(id2);
        frame.add(pw);
        frame.add(pw2);
        frame.add(ok);
        frame.add(del);

        //ok버튼 - 아이디와 패스워드가 root, 1234가 맞는지 체크
        //del버튼 - 입력한 값 지우기 처리

        ok.addActionListener(new ActionListener() { // ok 버튼
            @Override
            public void actionPerformed(ActionEvent e) {
                //ok 버튼을 클릭했을 때 처리하는 내용을 넣으세요
                String id3 = id2.getText(); //id2에 입력한 값을 가지고 와주는 함수
                String pw3 = pw2.getText();
                System.out.println(id3.length() + " " + pw3.length());


                //id3가 root이고, pw3이 1234와 같으면,
                //로그인 성공!
                //아니면 로그인 실패!

                if(id3.length() > 0 && pw3.length() > 0) {
                    if (id3.equals("root") && pw3.equals("1234")) { // 기본형일때는 == 으로 표현 가능,
                        // == 을 쓰면 주소값을 가져옴 .equals로 표시
                        //JOptionPane.showMessageDialog(frame, "로그인 성공!");
                        frame.setTitle("로그인 성공!");
                    } else {
                        frame.setTitle("로그인 실패!");
                        //JOptionPane.showMessageDialog(frame, "로그인 실패!");
                    }
                } else {
                    //JOptionPane.showMessageDialog(frame, "ID와 PW를 입력하세요.");
                    frame.setTitle("ID와 PW를 입력하세요.");
                }
            }
        });

        del.addActionListener(new ActionListener() { //Del 버튼
            @Override
            public void actionPerformed(ActionEvent e) {
                id2.setText(""); //del 누르면 id랑 pw 삭제
                pw2.setText("");
            }

        });

        //맨 끝!
        frame.setVisible(true);

    }

}
