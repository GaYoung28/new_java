package org.example.day7.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class 일기쓰기화면 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JLabel 3개, JTextfield 3개, Jbutton 1개
        JLabel today = new JLabel();
        today.setText("오늘의 날짜");
        Font font = new Font("굴림", Font.BOLD, 25);
        today.setFont(font);

        JLabel title = new JLabel();
        title.setText("오늘의 제목");
        title.setFont(font);

        JLabel content = new JLabel();
        content.setText("오늘의 내용");
        content.setFont(font);

        JTextField today2 = new JTextField(10); // 몇글자 칠지
        JTextField title2 = new JTextField(10);
        JTextField content2 = new JTextField(10);
        today2.setFont(font);
        title2.setFont(font);
        content2.setFont(font);

        JButton save = new JButton();
        save.setText("파일에 일기 저장");
        Font font2 = new Font("굴림", Font.BOLD, 45);
        save.setFont(font2);

        FlowLayout flowLayout = new FlowLayout(); // 물 흐르듯이 붙여줌
        frame.setLayout(flowLayout); // 배치해주는것으로 세팅


        today2.setForeground(Color.BLUE);
        title2.setForeground(Color.BLUE);
        content2.setForeground(Color.BLUE);
        save.setBackground(Color.MAGENTA);


        //frame.add 순서대로 붙여줌
        frame.add(today);
        frame.add(today2);
        frame.add(title);
        frame.add(title2);
        frame.add(content);
        frame.add(content2);
        frame.add(save);


        save.addActionListener(new ActionListener() { // 버튼에 처리하는 기능
            public void actionPerformed(ActionEvent e) {
                String today3 = today2.getText(); // 입력한거 가져오기 get~~() <---> set~~()
                String title3 = title2.getText();
                String content3 = content2.getText();

                System.out.println(today3);
                System.out.println(title3);
                System.out.println(content3);

                //파일을 만드는 부품
                //가지고 온 데이터를 파일에 저장

                // 파일도 만들어주고, 스트림으로 데이터를 저장까지 해주는 부품!
                try {
                    FileWriter file = new FileWriter(today3 + ".txt");
                    file.write(today3 + "\n");
                    file.write(title3 + "\n");
                    file.write(content3 + "\n");
                    file.close(); // 보내는 것이기 때문에 닫아줘야함..
                    JOptionPane.showMessageDialog(frame,"파일 저장 성공");
                } catch (IOException ex) {
                    System.out.println("파일과 관련된 문제가 생김.");
                }

            }
        });
        frame.setVisible(true);
    }
}
