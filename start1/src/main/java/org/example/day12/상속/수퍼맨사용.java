package org.example.day12.상속;

public class 수퍼맨사용 {


    public static void main(String[] args) {
        수퍼맨 s = new 수퍼맨('m',"클라크",100);
       // s.gender = 'm';
       // s.name = "클라크";
       // s.power = 100;

        System.out.println(s); //toString()
        s.sleep();
        s.eat();
        s.run();
        s.날아다니다();
    }
}
