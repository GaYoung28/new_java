package org.example.day18.람다식;

public class 빼기인터페이스사용 {
    public static void main(String[] args) {
        빼기인터페이스 difference = (a,b) -> a-b;

        System.out.println(difference.subtract(20,5));
    }
}
