package org.example.quiz.Interface_네트워크문제.Q2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class 서버 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9000);


        while(true) {
            System.out.println("서버가 돌아가는중..");
            Socket socket = server.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("i am a java programmer!!");
            out.close();
            socket.close();
        }
    }
}
