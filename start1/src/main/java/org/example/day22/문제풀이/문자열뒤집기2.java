package org.example.day22.문제풀이;

public class 문자열뒤집기2 {
    public static void main(String[] args) {
        String myString = "bread";
        char[] c = myString.toCharArray();

        int last = myString.length() - 1;

        StringBuilder sb = new StringBuilder();
        for (int i = last; i >= 0; i--) {
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }
}
