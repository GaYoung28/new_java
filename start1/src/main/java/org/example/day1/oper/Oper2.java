package org.example.day1.oper;

public class Oper2 {
    public static void main(String[] args) {
        int x = 200;
        int y = 100;

        int sum = x + y; //정수+정수 ==> 결과는 무조건 정수
        System.out.println(sum);

        double div = y / x;//100/200 (x)

        double div2 = (double)y/x; // cpu가 타입을 변환하는 것을 casting
    }
}
