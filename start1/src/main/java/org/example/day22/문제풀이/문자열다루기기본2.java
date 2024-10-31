package org.example.day22.문제풀이;

public class 문자열다루기기본2 {
    public static void main(String[] args) {
        String s = "1234";
        boolean result = true;

        if(s.length() == 4 || s.length() == 6) {
            char[] c = s.toCharArray();
            for (char x : c) {
                if(x < '0' || x > '9') {
                    result = false;
                    break;
                }
            }
        }else {
            result = false;
        }
        System.out.println(result);
    }
}
