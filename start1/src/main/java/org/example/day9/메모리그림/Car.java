package org.example.day9.메모리그림;

public class Car {
    //필드2개 ==> 멤버변수, 전역변수(자동초기화)
    int size;
    int speed;

    //메서드2개 ==> 멤버메서드
    public String print() {
        return size + " " + speed;
    }

    public void hi() {
        int temp = 10; // hi()안에서만 쓸 수 있는 지역변수(자동초기화 아니므로 해줘야함), 기본형변수
        System.out.println("속도를 Speed up! " + temp);
        //메서드 정의 -->  실행되지 않음. 호출했을 때 실행!
        // 내 클래스 내에서는 함수와 변수를 마음대로 불러서 쓸수있다.
        // 외부에서는 참조형 변수 필요 ex) car1.print() 로
        System.out.println(print());
    }
}


