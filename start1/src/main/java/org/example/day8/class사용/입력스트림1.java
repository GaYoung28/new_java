package org.example.day8.class사용;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class 입력스트림1 {
    // 1바이트 입력
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:\\data\\imsi.txt");

            while (true) {
                int data = is.read();

                if (data == -1) break;
                System.out.println(data);

            }
            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
