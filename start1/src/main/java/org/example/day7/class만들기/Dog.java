package org.example.day7.class만들기;

public class Dog {

    //속성 ==> 멤버변수
    // 강아지
    //------
    //속성 - 2개 이상
    //동작 - 2개 이상
    //        public void 함수명() {}

    //내거실
    //---
    //강아지 만든 것 사용
    //Dog dog = new Dog();
    ////동작, 속성 지정해서 프린트

    public String size;
    public int age;

    public void eat() {
        System.out.println("밥먹기");
    }
    public void walk() {
        System.out.println("산책하기");
    }

}
