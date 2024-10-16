package org.example.day11.review;

public class Day {
    String doing;
    String location;
    int time;

    static int count;
    static int sum; // time 누적!
    //static 변수 <-> 인스턴스 변수
    //static 변수는 공유목적, 누적목적 ==> 정적변수, 클래스변수

    //객체생성시 멤버변수 초기화할 목적으로 !
    //생성자메서드, 객체생성시 자동호출!

    //생성자 메서드가 되기 위한 조건
    //1. 클래스 이름과 무조건 동일해야함.
    //2. return 타입을 명시하면 자동호출되지 않음

    // 생성자의 특징
    //1. 오버로딩할 수 있음.
    //2. 프로그래머가 하나도 생성자를 명시하지 않으면 컴파일러가 하나를 추가해줌
    //   public 클래스명() {..} --> 입력 매개변수가 없는 메서드를 생성해줌
    //   기본 생성자 (default constructor) --> 입력 매개변수가 없는 생성자 메서드

    //멤버변수 초기화! 생성자
    public Day(String doing, String location, int time) {
        this.doing = doing;
        this.location = location;
        this.time = time;
        count++;
        sum += time;
    }

    public static double getAvg() {
        //System.out.println(getDoing());
        // ==> static 메서드 내에서 내것을 호출할 때는 static 메서드만 가능!

        return sum/(double)count;
        //static 메서드 내에 사용할 수 있는 변수는 static 변수만 써야한다.!
        // 왜! ==> static은 객체생성하기 전에 언제든지 호출할 수 있는 개념이기 때문에
        //         객체생성 후 힙영역에 접근하여 사용하는 인스턴스 변수는 사용불가능!

    }

    public String getDoingTime(){
        return getDoing() + " " + time; //getDoing()은 Day 클래스 내에서는 내것이므로
                                        // 그냥 메서드이름()으로 바로 호출해서 사용가능!

    }

    public String getDoing() {
        return doing;
    }

    //멤버변수를 프린트할 목적
    //@Override --> 생략가능!
    public String toString() {
        return "하루{" +
                "doing='" + doing + '\'' +
                ", location='" + location + '\'' +
                ", time=" + time +
                '}';
    }

    // ==> 이 클래스로 생성된 객체(참조형변수, day1)를 프린트할 때
    //     프린트할 스트링을 자동으로 만들어주는 것!
    //     모든 클래스는 toString()메서드를 가지고 시작함.(묵시적)
    //     패키지명.클래스명@주소 --> 원래는 이렇게 스트링을 만들어줌.
}
