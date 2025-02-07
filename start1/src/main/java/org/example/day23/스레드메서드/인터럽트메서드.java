package org.example.day23.스레드메서드;

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(5000); // 5초 대기
            System.out.println("Thread is awake!");
        } catch (InterruptedException e) {
            // 인터럽트 발생 시 처리 코드 작성
            System.out.println("내가 깨어났다....");
        }
    }
}

public class 인터럽트메서드 {
    public static void main(String[] args) {
        //스레드객체생성
        //2초후에
        //인터럽트로 스레드 객체 깨우자.!
        //==> 실행대기 상태로 감.
        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("오류");
        }
        thread.interrupt();

    }
}
