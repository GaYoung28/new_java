package org.example.day13.상속;

public class 스레드사용2 {
    public static void main(String[] args) {
        TimeThread t = new TimeThread();
        EvenThread e = new EvenThread();

        t.start();
        e.start();
    }
}
