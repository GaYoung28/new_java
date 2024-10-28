package org.example.day20.알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 입력해서배열에넣기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("숫자입력>> ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(numbers));
    }
}
