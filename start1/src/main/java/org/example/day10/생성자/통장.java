package org.example.day10.생성자;

public class 통장 {
    String name;
    String ssn;
    int money;
    static int count; // 0 (전역변수 자동초기화)
    //static 키워드가 붙어있는 변수는 객체생성여부와 상관없이 클래스에서 바로 접근해서 사용 가능한 변수
    //정적변수, static 변수, 클래스 변수
    //"클래스명. 변수명"으로 접근해서 사용 가능 (인스턴스 변수와 반대개념)
    // 1) 객체마다 공유할 목적으로!(누적용)
    // 2) 객체생성하지 않고 언제든지 접근해서 사용할 목적으로

    public 통장(String name, String ssn, int money) {
        this.name = name;
        this.ssn = ssn;
        this.money = money;
        count++;
    }

    public String toString() {
        return "통장{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", money=" + money +
                '}';
    }
}
