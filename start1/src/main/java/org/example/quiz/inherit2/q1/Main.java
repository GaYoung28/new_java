package org.example.quiz.inherit2.q1;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyata","Camry",4);
        Bike b = new Bike("Yamaha", "MT-15",true);

        b.display();
        c.display();
    }
}
