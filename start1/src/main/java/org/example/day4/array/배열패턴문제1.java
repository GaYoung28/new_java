package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴문제1 {
    public static void main(String[] args) {
        // 1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        // 1-1. length가 10인 int 배열 생성
        int[] a = new int[10];

        // 1-2. Random을 이용하여 값을 넣기(범위 1~100, r.nextInt(100) + 1)
        //      Random의 씨앗값(seed)는 55
        Random r = new Random(55);
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100)+1;
        }

        // 1-3. 생성된 배열 요소 전체 출력
        System.out.println(Arrays.toString(a)); // 비파괴형
        //Arrays.sort(a); // 배열의 내용을 오름차순으로 정렬(작--> 큰 수)
        //System.out.println(Arrays.toString(a)); // 파괴형


        //2. 배열에 있는 값을 꺼내어 누적
        // 2-1. 감소하여 누적하는 변수 minus 선언하여 초기화
        // 2-2. 배열에 있는 값을 꺼내어 계속 감소
        // 2-3. minus값 출력

        int minus = 0;
        for (int x : a) {
            minus = minus - x;
        }
        System.out.println(minus);


        //3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        // 3-1. 더해서 누적하는 함수 sum 선언하여 초기화
        // 3-2. 배열에 있는 값 중 50보다 큰 것만 누적
        // 3-3. sum값 출력

        int sum = 0;
        for (int x : a) {
            if (x > 50) {
                sum = sum + x;
            }
        }
        System.out.println(sum);

        //4. 배열에 있는 값을 가지고 위치를 찾는 경우
        // 4-1. 배열내에 80보다 큰 값의 위치를 맨 앞부터 하나만 찾아 위치 프린트
        // 4-2. 80보다 큰 값을 찾으면 반복문 종료

        for (int i = 0; i < a.length; i++) {

            if(a[i] > 80) {
                System.out.println(i);
                break; //for문 중단
            }
        }


    }
}
