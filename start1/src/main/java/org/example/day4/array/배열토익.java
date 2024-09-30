package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열토익 {
    public static void main(String[] args) {
        //1. 답안 배열, 내답 배열
        //2. Random 이용해서 1~4까지 범위로 하여 배열에 990개를 넣으세요.
        //3. 답안과 내 답의 인덱스값을 각각 비교해서 맞으면 1점!
        //4. 총점을 출력해주세요.!

        int[] 답안 = new int[990];
        int[] 내답 = new int[990];

        Random r = new Random(42);
        for (int i = 0; i < 내답.length; i++) {
            답안[i] = r.nextInt(4) + 1;
            내답[i] = r.nextInt(4) + 1;
        }
        int jumsu = 0;
        for (int i = 0; i < 내답.length; i++) {
            if (답안[i] == 내답[i]) {
                jumsu++;
            }
        }
        System.out.println(jumsu);


        // 1. ppt p.48 성적변동문제

        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        int count = 0; // 성적 향상
        int count2 = 0; // 성적 동일

        for (int i = 0; i < term1.length; i++) {
            if (term1[i] < term2[i]) {
                count++;
            }
            if (term1[i] == term2[i]) {
                count2++;
            }
        }
        System.out.println(count);
        System.out.println(count2);


        // 2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
        //   숫자 입력 : 55
        //   숫자 입력 : 77
        //   숫자 입력 : 11
        //   ----------------
        //   합계 143
        //   평균 47.666666667

       Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("숫자 입력 : ");
            int i = sc.nextInt();
        }


        System.out.println("합계" + );
        System.out.println("평균" + ); */


        // 3. int[] n = new int[1000];
        //   random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
        //   3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
        //   3-2. 전체 합계와 평균 출력

        int[] n = new int[1000];
        Random r2 = new Random(44);
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
        }
        System.out.println(Arrays.toString(n));

        //   3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력

        System.out.println(n[0] + n[2] + n[4] + n[99] + n[990]);

        //   3-2. 전체 합계와 평균 출력
        int count3 = 0;
        for (int i = 0; i < n.length; i++) {
            count3 += n[i];
        }
        System.out.println(count3);
        System.out.println(count3 / n.length);


        // 4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
        //   (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
        //   가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
        //   당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.

        Scanner sc = new Scanner(System.in);
        System.out.println(" 가고싶은 곳(보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> ");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("열차");
        }
        if (a == 2) {
            System.out.println("배");
        }
        if (a == 3) {
            System.out.println("비행기");
        }
        System.out.println("당신이 가고싶은 곳인" + a);





        // 5. random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
        //80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력


        int[] n2 = new int[1000];
        Random r3 = new Random(555);
        for (int i = 0; i < n.length; i++) {
            n2[i] = r3.nextInt(100) + 1;
        }

        int count4 = 0; // 80 이상 개수
        int count5 = 0; // 70~79 개수
        int count6 = 0; // 50~69 개수
        int count7 = 0; // 49보다 작은 수 개수

        for (int i = 0; i < n2.length; i++) {
            if (n2[i] >= 80) {
                count4++;
            }
            if (69 < n2[i] && n2[i] < 80) {
                count5++;
            }
            if (69 < n2[i] && n2[i] < 80) {
                count6++;
            }

            if (n2[i] < 49) {
                count7++;
            }

        }


        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);


    }
    }


