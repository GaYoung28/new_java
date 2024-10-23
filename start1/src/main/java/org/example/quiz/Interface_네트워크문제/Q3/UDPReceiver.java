package org.example.quiz.Interface_네트워크문제.Q3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[256];
        DatagramPacket packet = new DatagramPacket(data, data.length);

        DatagramSocket socket = new DatagramSocket(7100);

        System.out.println("받는 쪽 소켓 시작");
        System.out.println("받을 준비 끝");
        socket.receive(packet);

        System.out.println(new String(data));
        socket.close();

    }
}
