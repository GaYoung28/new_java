package org.example.day13.예외처리;

public class 예외처리문제 {
    public static void main(String[] args) {

        try {
            String[] names = {"홍길동", "김길동"};
            System.out.println(names[10]);
            int[] ages = null;
            System.out.println(ages.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생 : 배열의 인덱스가 잘못되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램이 종료되었습니다.");
        }


    }
}
