package org.example.quiz.Interface_네트워크문제.Q1;

public class Computer사용 {
    public static void main(String[] args) {
        AppleComputer apple = new AppleComputer();
        apple.start();
        apple.shutdown();
        apple.restart();

        BananaComputer banana = new BananaComputer();
        banana.start();
        banana.shutdown();
        banana.restart();

    }
}
