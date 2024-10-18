package org.example.quiz.inherit2.q2;

public class Smartphone extends Move { // 스마트폰
    private int cameraResolution; // 카메라 해상도

    public Smartphone(int batteryCapacity, String color, int cameraResolution) {
        super(batteryCapacity, color);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "batteryCapacity=" + batteryCapacity +
                ", cameraResolution=" + cameraResolution +
                ", color='" + color + '\'' +
                '}';
    }

}

