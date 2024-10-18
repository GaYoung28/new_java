package org.example.day13.상속;

public class EvenThread extends Thread {

    public void run() {
        for (int i = 100; i < 500; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
}
