package org.example.quiz.static문제.q3;

public class 직원 {
    String name;
    int age;
    String gender;
    static int count;
    static int total;

    public 직원(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
        total += age;

    }

    public String toString() {
        return "직원{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
