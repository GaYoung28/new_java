package org.example.day18.람다식;

public class 대문자변환인터페이스사용 {
    public static void main(String[] args) {
         대문자변환인터페이스 toUpperCase = (input -> input.toUpperCase());

        System.out.println(toUpperCase.convert("abc"));


    }
}
