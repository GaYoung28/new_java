package org.example.quiz.array;

import java.util.Arrays;
import java.util.Random;

public class q1 {
    public static void main(String[] args) {
        //1. 랜덤한값 1부터 100사이의값을 20개 만들어배열에넣어출력

        Random r = new Random();
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(100) + 1;
        }
        System.out.println("배열 프린트 : " + Arrays.toString(n));

        //2. 배열에있는값들을오름차순으로정렬후 출력

        Arrays.sort(n);
        System.out.println("오름차순 정렬 후 프린트 : " + Arrays.toString(n));

        //3. 배열에들어있는값의최대값을찾아출력
        int max = n[(n.length)-1];
        System.out.println("최대값 : " + max);


        //4. 배열에들어있는값의최소값을찾아출력
        int min = n[0];
        System.out.println("최소값 : " + min);


    }
}
