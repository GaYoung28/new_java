package org.example.day3.array;

import java.util.Arrays;
import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int[]a = new int[3]; //{0,0,0}으로 초기화되어있음.
        //주소가 들어가있음. a변수(참조형 변수)
        System.out.println(a);
        a[0] = 100;
        a[1] = 200;
        a[a.length - 1] = 300;
        System.out.println(Arrays.toString(a));


        //1. 정수 배열을 만들어 11,22,33,44,55를 넣으세요.(처음부터 값을 알고 있는 경우)
        int[] a2 = {11, 22, 33, 44, 55};

        //1-1. 첫번째 값을 프린트
        System.out.println("첫번째 값 ==> " + a2[0]);
        //1-2. 세번째 값을 프린트
        System.out.println("세번째 값 ==> " + a2[2]);
        //1-3. 마지막 값을 프린트
        System.out.println("마지막 값 ==> " + a2[a2.length - 1]); //마지막 값 프린트할 때 전체 크기보다 하나 작은 값으로 표현
        //1.4. 전체 프린트
        System.out.println(Arrays.toString(a2));


        //2. 실수 배열을 만들어 11.1, 22.2, 33.3을 넣으세요.(처음부터 값을 알고 있는 경우)
        double [] a3 = {11.1, 22.2, 33.3, 44.4, 55.5};
        //2-1. 첫번 째 값과 두번째 값을 더해서 프린트
        System.out.println(a3[0] + a3[1]);
        //2-2. 첫번 째 값과 마지막 값을 더해서 프린트
        System.out.println(a3[0] + a3[4]);
        //2-3. 배열에 들어있는 전체 개수를 프린트
        System.out.println(a3.length);
        //2-4. 전체 프린트
        System.out.println(Arrays.toString(a3));


        //3. 개수가 4개인 문자(char) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        char[]a4 = new char[4];
        //3-1. 첫 번째 위치에 '남'을 넣어, 첫 번째 값 프린트
        a4[0] = '남';
        System.out.println(a4[0]);
        //3-2. 두 번째 위치에 '여'를 넣어, 두 번째 값 프린트
        a4[1] = '여';
        System.out.println(a4[1]);
        //3-3. 전체 개수와 전체 배열의 값을 프린트
        System.out.println(a4.length);
        System.out.println(Arrays.toString(a4));


        //4. 개수가 3개인 문자열(String) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        String[] a5 = new String[3];
        //4-1. 각 인덱스의 자리에 여행가고 싶은 곳을 제일 가고 싶은 곳부터 순서대로 세 곳을 넣어서 저장(부산, 제주도, 전주인 경우)
        a5[0] = "부산";
        a5[1] = "제주도";
        a5[2] = "전주";
        //4-2. 전체 프린트
        System.out.println(Arrays.toString(a5));
        //4-3. 다음과 같이 프린트되도록 처리 내가 첫 번째 가고 싶은 곳은 부산이고, 마지막 가고 싶은 곳은 전주이다
        System.out.println("내가 첫번째 가고 싶은 곳은 " + a5[0] + "이고, 마지막 가고싶은 곳은 " + a5[2] + "이다.");



        //Q1- Array
        // 1.
        int[]x = new int[20];
        Random r = new Random();
        for(int i = 0; i < x.length; i++){
            x[i] = r.nextInt(100);
        }
        System.out.println("배열 프린트 : " + Arrays.toString(x));

        //2.


        //System.out.println("배열 프린트: " + Arrays.toString(c));

        // 2.








    }
}

