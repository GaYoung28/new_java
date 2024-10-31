package org.example.day22.문제풀이;

public class 대문자소문자 {
    public static void main(String[] args) {
        String myString = "cccCCC";
        char[] c = myString.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char x : c) {
            if(x >= 'a' && x <= 'z') x -= 32;
            else if(x >= 'A' && x <= 'Z') x += 32;
            sb.append(x);
        }
        System.out.println(sb.toString());
    }
}
