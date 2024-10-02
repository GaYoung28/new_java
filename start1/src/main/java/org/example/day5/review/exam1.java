package org.example.day5.review;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};
        // 문제 1
        //누적시키는 변수는 반복문 안에 넣으면 x
        int high = 0, same = 0;


        //c타입의 for문 : i를 이용가능, 입력/출력 가능, 여러개의 배열을 다룰 때
        //for - each문 : 간단, i 사용 x, 출력만 가능, 하나의 배열을 다룰 때
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] == term2[i]) { //조건에 해당하는 구문의 결과는 무조건 논리형
                same++;
            } else if (term2[i] > term1[i]) {
                high++;
            }//if
        }//for
        System.out.println(high + " " + same);


        // 문제 2

        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("숫자 입력 : ");
            data[i] = sc.nextInt();

        }
        ;
        System.out.println(Arrays.toString(data)); // -> 배열에 있는 데이터를 가져다가 "[값, 값, 값]"의 String으로 만들어준다.

        //합, 평균(2번째 패턴)
        int sum = 0;
        for (int x : data) {
            sum += x;
        }

        //연산시 하나라도 실수이면 결과는 실수이다
        System.out.println(sum);
        System.out.println(sum / (double) data.length);


        //3번
        int[] n = new int[1000];
        int sum2 = 0;
        Random r = new Random(44);
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
            sum2 += n[i];
        }
        System.out.println(Arrays.toString(n));
        System.out.println(sum2);
        System.out.println(sum2 / (double) n.length);
        System.out.println(n[0] + n[2] + n[4] + n[99] + n[989]);


        //4번
        System.out.print("가고싶은 곳(보기, 1)백두산, 2)한라산, 3)후지산) 입력 >>  ");
        //입력 --> 처리(저장) --> 출력
        int input = sc.nextInt();

        String result = null;// 주소가 없다. 참조형, string 초기화 null로
        switch (input) {
            case 1:
                result = "백두산은 열차";
                break;
            case 2:
                result = "한라산은 배";
                break;
            case 3:
                result = "후지산은 비행기";
                break;
            default:
                result = "안탐!";
        }
        System.out.println("당신이 가고싶은 곳인 " + result + "를 타고 가야합니다.");


        //5번
        //length == 길이 == 개수 == size

        int[] n2 = new int[1000];
        Random r2 = new Random(555);
        int c80 = 0, c70 = 0, c50 = 0, c0 = 0; //여러 개 변수 다 따로 초기화


        for (int i = 0; i < n2.length; i++) {
            n2[i] = r2.nextInt(100) + 1;
            if (n2[i] > c80) {
                c80++;
            }
            else if (n2[i] >= c70) {
                c70++;
            }
            else if (n2[i] >= c50) {
                c50++;
            }
            else {
                c0++;
            }

        }

        System.out.println(c80+" "+c70+" "+c50+" "+c0);







        }//main
    }//class

