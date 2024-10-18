package org.example.quiz.static문제.q2;

public class Day {
    String doing;
    int time;
    String place;
    static int total;

    public Day(String doing, int time, String place) {
        this.doing = doing;
        this.time = time;
        this.place = place;
        total += time;
    }

    public String toString() {
        return "Day{" +
                "doing='" + doing + '\'' +
                ", time=" + time +
                ", place='" + place + '\'' +
                '}';
    }

}
