package org.example.day22.문제풀이;

public class 특정문자제거 {
    public static void main(String[] args) {
        //6. 216페이지 - 특정문자 제거하기

        String myString = "abcdef";
        String letter = "f";
        //myString에 있는 것 하나씩 빼서 f가 아니면 모으자!
        //String을 모을 때는 StringBuilder 쓰자
        StringBuilder sb = new StringBuilder();

        //myString에 있는 것 하나씩 빼는 방법
        //1. char 배열로
        //2. charAt(인덱스)
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
            if (myString.charAt(i)!= letter.charAt(0)) { //값 비교할 때는 기본형만 비교 가능
                //letter를 char형으로 변경
                sb.append(myString.charAt(i));
            }
        }
        String s = sb.toString();
        System.out.println(s);

        //replace 쓰는 것이 훨씬 간단
        String result2 = myString.replace(letter,"");
        System.out.println(result2);
    }

}
