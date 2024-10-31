package org.example.day22.문제풀이;

public class 숫자찾기 {
    public static void main(String[] args) {
        //11. 191페이지 - 숫자찾기

        char c = '1';
        char c2 = '2';
        System.out.println(c + c2); //99 : 아스키값
        //int로 변경 후 더해야함.
        int ic = c - '0'; //49 - 48 = 1
        int ic2 = c2 - '0'; //50 - 48 = 2
        System.out.println(ic + ic2);

//        int sum = 0;
//        for (char x : a) {
//            sum += x - '0';
//        }
//        System.out.println(sum);


        int num = 29183;
        String s = String.valueOf(num);
        //String num2 = num + "";

        int k = 1;

        int n = 0; // 몇번째인지 -> index + 1

        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] - '0' == k) { // a[i]는 char배열, k는 정수 -> '0'빼주기
                n = i + 1; // index + 1
            }
            else{
                n = -1;
            }
        }
        System.out.println(n);
    }
}
