package org.example.day7.class사용;

import org.example.day7.class만들기.Dog;
import org.example.day7.class만들기.TV;
import org.example.day7.class만들기.Television;

public class 내거실 {
    public static void main(String[] args) {
        TV myTv = new TV();
        TV yourTv = new TV();
        //메서드는 생성된 객체의 주소만 있으면 된다.!

        myTv.채널을바꾸다();
        yourTv.채널을바꾸다();
        myTv.ch = 7;
        myTv.vol = 9;
        myTv.onOff = true;

        yourTv.ch = 9;
        yourTv.vol = 12;
        yourTv.onOff = true;









        Television tv = new Television();
        tv.powerOn();
        //tv.changeCh();
        tv.powerOff();

        System.out.println(tv.size); // 변수를 다른 클래스에서도 사용하려면 변수앞에 public 붙여줘야 함.
        System.out.println(tv.price);

        tv.size = "small";
        tv.price = 10000;

        System.out.println(tv.size);
        System.out.println(tv.price);



        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dog.eat();
        dog.walk();

        dog.size = "medium";
        dog.age = 5;

        dog2.size = "small";
        dog2.age = 6;


        System.out.println(dog.size + " " + dog.age);
        System.out.println(dog2.size + " " + dog2.age);






    }
}
