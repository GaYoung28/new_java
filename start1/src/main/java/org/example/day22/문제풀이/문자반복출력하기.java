package org.example.day22.문제풀이;

public class 문자반복출력하기 {
    public static void main(String[] args) {
        String myString = "hello";
        int n = 3;
        //1. n을 char로 분리시켜서 1)char 배열 2)charAt(인덱스)
        //2. k만큼 반복해서- for문
        //3. 붙이자 - StringBuilder

        char[] c = myString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char x : c) {
            for (int i = 0; i < n; i++) {
                sb.append(x);
            }
        }
        System.out.println(sb.toString());
    }
}
