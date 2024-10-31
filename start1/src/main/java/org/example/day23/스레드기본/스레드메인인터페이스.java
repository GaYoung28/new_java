package org.example.day23.스레드기본;

public class 스레드메인인터페이스 {
    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable() { // 인터페이스는 new로 객체 생성 x, 익명클래스임
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("나는 별!!!");
                }
            }
        });
        Thread t2= new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("나는 달러!!!");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
