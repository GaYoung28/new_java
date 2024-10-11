package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림2 {
    // 바이트 배열 출력
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("c:\\data\\imsi2.txt");

            byte[] array = {10, 20, 30};


            os.write(array);

            os.flush();
            os.close();

        } catch (Exception e) {
            e.printStackTrace(); //자세하게 프린트
        }
    }
}
