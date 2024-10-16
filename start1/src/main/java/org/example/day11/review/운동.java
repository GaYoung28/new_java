package org.example.day11.review;

public class 운동 {
    String name;
    String with;
    int time;
    static int count;
    private static int sum;

    public 운동(String name, String with, int time) {
        this.name = name;
        this.with = with;
        this.time = time;
        count++;
        sum += time;
    }

    public static int gettime() {
        return sum;
    }

    @Override
    public String toString() {
        return "운동{" +
                "name='" + name + '\'' +
                ", with='" + with + '\'' +
                ", time=" + time +
                '}';
    }
}
