package org.example.day12.상속;

public class Truck extends Car{

    int weight;
    public void move() {
        System.out.println(speed + " 속도로 짐을 나르다.");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
