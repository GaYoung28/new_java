package org.example.day13.예외처리;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 파일저장예외처리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명 입력>> ");
        String f = sc.next();
        System.out.println("파일내용 입력>> ");
        String content = sc.next();

        FileWriter file = null;

        try {
            file = new FileWriter("c:/data/" + f);
            file.write(content);
            file.close();
        } catch (IOException e) {
            System.out.println("에러발생");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("");
        }

    }

}
