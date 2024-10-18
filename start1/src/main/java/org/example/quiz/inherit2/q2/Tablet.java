package org.example.quiz.inherit2.q2;

public class Tablet extends Move{
    private boolean isconnected;

    public Tablet(int batteryCapacity, String color, boolean isconnected) {
        super(batteryCapacity, color);
        this.isconnected = isconnected;
    }
    public boolean getIsconnected() {
        return isconnected;
    }
    public void getisconnected() {}
}
