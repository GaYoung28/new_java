package org.example.day22.문제풀이;

public class 문자열뒤집기 {
    public static void main(String[] args) {

        //10. 246페이지 - 문자열 뒤집기

        String myString = "bread";
        //뒤집어서 스트링으로 모으자
        //StringBuilder
        //String에서 뒤에서 가지고 와서 sb에 쌓기만 함
        int last = myString.length() -1;
        StringBuilder sb = new StringBuilder();
        for (int i = last; i >= 0; i--) {
            sb.append(myString.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
