package org.example.day13.상속;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread {

    public void run() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        for (int i = 0; i < 300; i++) {
            System.out.println(sdf.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김");
            }
        }
    }
}
