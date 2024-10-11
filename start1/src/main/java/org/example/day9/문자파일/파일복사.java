package org.example.day9.문자파일;

import java.io.*;

public class 파일복사 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/공부.txt");
            OutputStream os = new FileOutputStream("c:/data/공부2.txt");
            is.transferTo(os);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
