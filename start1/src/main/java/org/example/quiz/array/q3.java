package org.example.quiz.array;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        // 학생들의 점수를 분석하는 프로그램을 만들려고 한다. 키보드로부터 학생 수와 각 학생들의 점수를 입력받고
        //while문과 Scanner를 이용해서 최고 점수 및 평균 점수를 출력하는 코드를 작성해보세요


        Scanner sc = new Scanner(System.in);
        int num = 0;
        int[] scores = null;
        int choice = 0;

        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------------------------------------");
            System.out.print("선택> ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("학생수> ");
                    num = sc.nextInt();
                    scores = new int[num];
                    break;

                case 2:
                    for (int i = 0; i < num; i++) {
                        System.out.print("scores[" + i + "]> ");
                        scores[i] = sc.nextInt();
                    }
                    break;

                case 3:
                    for (int i = 0; i < num; i++) {
                        System.out.println("scores[" + i + "] : " + scores[i]);
                    }
                    break;

                case 4:
                    int max = 0;
                    int sum = 0;
                    for (int i = 0; i < num; i++) {
                        if (max < scores[i]) {
                            max = scores[i];
                        }
                        sum = sum + scores[i];
                    }
                    double avg = (double) sum / num;
                    System.out.println("최고 점수 : " + max);
                    System.out.println("평균 점수 : " + avg);
                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    return;
            }

        }
    }
}


