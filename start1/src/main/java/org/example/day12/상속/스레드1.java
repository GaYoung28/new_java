package org.example.day12.상속;

public class 스레드1 extends Thread {
        @Override
        public void run() {
            for (int i = 500; i >= 1 ; i--) {

                try {
                    System.out.println(i);
                    Thread.sleep(5);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

