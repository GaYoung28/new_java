package org.example.day9.문자파일;

import java.io.*;

public class 버퍼읽기 {
    public static void main(String[] args) {

         try {
            InputStream is = new FileInputStream("c:/new_java/start1/build.gradle");
            Reader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader); 
            while(true) {
                String line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            is.close();
            reader.close();
            br.close();
        } catch (Exception e) {
             throw new RuntimeException(e);
        }
        System.out.println(System.nanoTime());

    }
}
