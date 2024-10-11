package org.example.day9.문자파일;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class 문자읽기 {
    public static void main(String[] args) {
        try{
            Reader reader = null;

            reader = new FileReader("C:/data/20241010.txt");
            while(true){
                int data = reader.read(); // 1 문자를 읽음
                if(data == -1) break; // 파일을 다 읽으면 while문 종료
                System.out.print((char)data); //읽은문자 출력
            }
            reader.close();
            System.out.println();


            reader = new FileReader("C:/data/20241010.txt");
            char[] data = new char[100]; // 읽은 문자를 저장할 배열 생성
            while(true){
                int num = reader.read(data); //읽은 문자는 배열에 저장, 읽은 문자 수는 리턴
                if(num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
