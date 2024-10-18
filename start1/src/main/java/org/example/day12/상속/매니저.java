package org.example.day12.상속;

public class 매니저 extends 직원{

    int bonus;

    public 매니저(String name, String address, int salary, int rrn) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }


    public void test() {
        System.out.println();

    }

    @Override
    public String toString() {
        return "매니저{" +
                "bonus=" + bonus +
                '}';
    }
}
