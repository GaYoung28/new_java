package org.example.day12.상속;

public class 스레드3 extends Thread {
    @Override
    public void run() {
        String[] foods = {"a","b","c","d","e","f"};
        for (int i = 0; i < foods.length; i++) {

            try {
                System.out.println(foods[i]);
                Thread.sleep(3000);//3초
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
