package org.example.day19.디자인패턴;

public class DatabaseConnection객체생성 {
    public static void main(String[] args) {
        DatabaseConnection one = DatabaseConnection.getInstance();
        System.out.println(one.hashCode());

        DatabaseConnection two = DatabaseConnection.getInstance();
        System.out.println(two.hashCode());

        DatabaseConnection three = DatabaseConnection.getInstance();
        System.out.println(three.hashCode());
    }

}
