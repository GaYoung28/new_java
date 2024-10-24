package org.example.day18.람다식;

public class 문자열길이인터페이스사용 {
    public static void main(String[] args) {
        문자열길이인터페이스 length = (input) -> input.length();
        System.out.println(length.getLength("Lambda Expression"));
    }
}
