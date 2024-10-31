package org.example.day22.문제풀이;

public class 특정문자제거2 {
    public static void main(String[] args) {
        String myString = "abcdef";
        String letter = "f";

        //1. char 배열로 바꾸기
        StringBuilder sb = new StringBuilder();
        char[]c = myString.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] != letter.charAt(0)) {
                sb.append(c[i]);
            }
        }
        System.out.println(sb.toString());

        //2. replace
        String result = myString.replace(letter,"");
        System.out.println(result);
    }
}
