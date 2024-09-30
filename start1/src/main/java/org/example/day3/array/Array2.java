package org.example.day3.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //우리 가족 정보를 배열에 넣어보자.
        //5명, 이름(string), 나이(int), 키, 성별, 아침여부

        String[] names = {"홍길동", "김길동", "박길동", "송길동", "정길동"};
        //System.out.println(names[0]);
        //System.out.println(names[1]);
        //System.out.println(names.length);
        for (int i = 0; i < names.length; i++) { //names.length ==> 5 (5로 적으면 바꿔줘야 하는 값)
            System.out.println(names[i]);
        }
        //for-each 문 : 처리, 출력만 가능, 간단하나 기능은 제한적/ 변수 s는 하나만 만들어서 여러번 사용
            for(String s : names){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(names)); // 배열에 있는 것 확인할 때



        int[] ages = {10, 20, 30, 40, 50};
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        // for- each 문
        for(int s : ages){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(ages));



        int[] height = {100, 120, 150, 160, 170};
        for (int i = 0; i < height.length; i++) {
            System.out.println(height[i]);
        }
        for(int s : height){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(height));



        char[] gender = {'남','여','남','여','여'};
        for (int i = 0; i < gender.length; i++) {
            System.out.println(gender[i]);
        }
        for(char s : gender){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(gender));



        boolean[] eat = {true, false, true, false, true};
        for (int i = 0; i < eat.length; i++) {
            System.out.println(eat[i]);
        }
        for(boolean s : eat) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(eat));

        System.out.println(names[names.length-1]); // names[5]--> 배열 범위 벗어남. 마지막 인덱스 출력하려면 length보다 하나 작은값으로 입력

    }
}