package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열문제 {
    public static void main(String[] args) {
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
        int count3 = 3; //입력받을 숫자횟수
        int[]a = new int[count];

        for(int i = 0; i < count3; i++) {
            System.out.print("숫자 입력 : ");
            a[i] = sc. nextInt();

        }
        int sum = a[0] + a[1] + a[2];
        double avg = (double) sum/3;

        System.out.println("----------------");

        System.out.println("합계" + "\t" + sum );
        System.out.println("평균" + "\t" + avg);









        // 3. int[] n = new int[1000];
        //   random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
        //   3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
        //   3-2. 전체 합계와 평균 출력

        int[] n = new int[1000];
        Random r = new Random(44);
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
        }
        System.out.println(Arrays.toString(n));

        //   3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력

        System.out.println(n[0] + n[2] + n[4] + n[99] + n[989]);

        //   3-2. 전체 합계와 평균 출력
        int sum2 = 0;
        for (int i = 0; i < n.length; i++) {
            sum2 += n[i];
        }
        System.out.println(sum2);
        System.out.println(sum2 / n.length);




        // 4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
        //   (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
        //   가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
        //   당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.

        //Scanner scanner = new Scanner(System.in); //scanner는 한번만 (위에서 이미 씀)
        System.out.print("가고싶은 곳(보기, 1)백두산, 2)한라산, 3)후지산) 입력 >>  ");
        int destination = sc.nextInt();

        String place = "";
        String transport = "";

        if (destination == 1) {   // --> case문으로 쓰면 더 간단
            place = "백두산";
            transport = "열차";
        }
        if (destination == 2) {
            place = "한라산";
            transport = "배";
        }
        if (destination == 3) {
            place = "후지산";
            transport = "비행기";
        }
        System.out.println("당신이 가고싶은 곳인 " + place + "은 " + transport + "를 타고 가야합니다.");

        sc.close();





        // 5. random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
        //80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력


        int[] n2 = new int[1000];
        Random r2 = new Random(555);
        for (int i = 0; i < n2.length; i++) {
            n2[i] = r2.nextInt(100) + 1;
        }

        int count4 = 0; // 80 이상 개수
        int count5 = 0; // 70~79 개수
        int count6 = 0; // 50~69 개수
        int count7 = 0; // 49보다 작은 수 개수

        for (int i = 0; i < n2.length; i++) { //위에 for문과 묶어서 하나만 써주기
            if (n2[i] >= 80) {
                count4++;
            }
            else if (n2[i] >= 70) {
                count5++;
            }
            else if (n2[i] >= 50) {
                count6++;
            }
            else {
                count7++;
            }

        }

        System.out.println(Arrays.toString(n2));
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);


    }
}

