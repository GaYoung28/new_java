package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴 {
    public static void main(String[] args) {
        // 1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        int[] jumsu = new int[5]; //{0, 0, 0, 0, 0}
        Random r = new Random(100); //아무값이나 만들어주는 부품

        for (int i = 0; i < jumsu.length; i++) {
            // String num = JOptionPane.showInputDialog("숫자입력"); //string형태라 int 배열에 넣을 수 없음
            // jumsu[i] = Integer.parseInt(num);
            jumsu[i] = r.nextInt(100);// int 범위 ==> -21억~+21억, 0~ 99범위.
        }
        System.out.println(Arrays.toString(jumsu));



        // 2. 배열에 있는 값을 꺼내어 누적
        int sum = 0;
        for (int x : jumsu) {
            sum = sum + x;
            //앞의 sum : 새 값까지 누적된 값
            //뒤의 sum : 이전까지 더해진 값
        }
        System.out.println(sum);



        // 3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        int sum2 = 0;
        for (int x : jumsu) { //x는 for문 안에서만 사용되기 때문에 (지역변수) 다른곳에서도 사용할 수 있다.
            if (x >= 80) {
                sum2 = sum2 + x; //sum2 += x;
            }
        }
        // 코드정리(코드 포맷팅) 컨트롤 + 알트 + L
        System.out.println(sum2);



        // 4. 배열에 있는 값을 가지고 위치를 찾는 경우
        for (int i = 0; i < jumsu.length; i++) { //위치 찾을 때는 for-each문 X

            if (jumsu[i] == 88) {
                //88이 하나인 경우
                System.out.println("88찾음.");
                System.out.println(i + 1 + "번째에 있음.");
                break; //반복문의 break!
            }

        }
    }
}
