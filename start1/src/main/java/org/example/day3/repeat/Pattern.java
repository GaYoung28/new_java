package org.example.day3.repeat;

import javax.swing.*;

public class Pattern {
    public static void main(String[] args) {
        //숫자 누적
        int sum = 0; //누적용 변수, 반복문 안에 넣지 않음.
        for (int i = 100; i < 1000 ; i++) {
                 sum = sum + i; // sum += i;

        }
        //문자열 누적
        String sum2 = ""; //String은 누적용일 때 ""으로 초기화! null로 나타내면 출력결과에 null이 표시됨
        for (int i = 0; i < 3; i++) {
            String data = JOptionPane.showInputDialog("과목 입력");
            sum2 = sum2 + data; // sum += data;

        }
        System.out.println(sum);
        System.out.println(sum2);

        }

    }

