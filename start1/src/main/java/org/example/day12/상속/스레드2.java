package org.example.day12.상속;

import java.util.Date;

public class 스레드2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 3000; i++) {
                System.out.println(new Date());
            }
        }

    }
