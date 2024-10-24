package org.example.day18.람다식;

public class 합계인터페이스사용 {
    public static void main(String[] args) {
        합계인터페이스 sum = (x, y) -> x + y;
        System.out.println(sum.add(100, 200));

        합계인터페이스 sum2 = (x, y) -> (x + 100) + (y - 100);
        System.out.println(sum2.add(100, 200));
    }
}
