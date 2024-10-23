package org.example.quiz.Interface_네트워크문제.Q3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws IOException{
        DatagramSocket socket = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        String s = "i am a android programmer!";
        byte[] data = s.getBytes();

        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);

        socket.send(packet);
        socket.close();

    }

}
