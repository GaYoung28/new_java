package org.example.quiz.inherit2.q1;

public class Bike extends Vehicle {
    private boolean hasCarrier;


    public Bike(String brand, String model, boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }

    public void hasCarrier() {
        this.hasCarrier = hasCarrier;
    }

    public void display() {
        super.display();
        System.out.println("hasCarrier : " + hasCarrier);
    }
}
