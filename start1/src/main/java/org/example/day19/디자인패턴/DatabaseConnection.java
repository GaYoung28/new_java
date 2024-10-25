package org.example.day19.디자인패턴;

public class DatabaseConnection {
    private static DatabaseConnection single;
    private DatabaseConnection() {
        System.out.println("데이터베이스 연결 객체가 생성되었습니다.");
    }

    public static DatabaseConnection getInstance() {
        if (single == null) {
            single = new DatabaseConnection();
        }
        return single;
    }
    public String toString() {
        return single.hashCode() + "";
    }
}
