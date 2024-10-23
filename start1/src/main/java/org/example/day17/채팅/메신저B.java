package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class 메신저B extends JFrame {
    JTextArea list;

    메신저B() {
        //여기에 코드 다하면, static이 아니여서 더 좋은 코드를 만들 수 있음.
        System.out.println("생성자 시작.");

        setTitle("메신저B");
        setSize(500, 500);
        getContentPane().setBackground(Color.orange);

        list = new JTextArea();
        JTextField input = new JTextField();
        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);

        //list 색, 세로 스크롤, 가로글자 넘어가는 것 방지, 글자크기30

        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setFont(font);
        list.setBackground(Color.orange);
        input.setBackground(Color.lightGray);
        list.setLineWrap(true); //글자 많아지면 옆으로 벗어나지 않게!
        list.setAutoscrolls(true); //스크롤 만드는 기능
        list.setEditable(false); //textarea에 입력 불가능

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //엔터쳤을 때 실행하고 싶은 내용을 쓰자.
                //input에 입력한 데이터를 가지고와서
                String data = input.getText();

                //list 끝에 붙이세요.
                list.append("나 : " + data + "\n");
                input.setText(""); //입력한거 지우기!

                try {
                    DatagramSocket socket = new DatagramSocket();
                    byte[] data2 = data.getBytes();
                    InetAddress ip = InetAddress.getByName("localhost");

                    DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5555);
                    socket.send(packet);
                    socket.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        setVisible(true);
    }

    public void process() throws Exception {
        //메신저가 시작하자마자 무한루프로 받는거 돌아가게 해야함.
        //전화기 역할 소켓만들고!
        DatagramSocket socket = new DatagramSocket(7777);
        while (true) {
            //공간 byte[]. packet 만들어주고
            byte[] data = new byte[30];
            DatagramPacket packet = new DatagramPacket(data, data.length);

            //받아라!
            socket.receive(packet);
            System.out.println(socket.getLocalPort());
            list.append("너: " + new String(data) + "\n");
        }
    }
    public static void main(String[] args) throws Exception {
        메신저B m = new 메신저B();
        //메신저가 시작하자마자 무한루프로 받는거 돌아가게 해야함.
        m.process();
    }
}
