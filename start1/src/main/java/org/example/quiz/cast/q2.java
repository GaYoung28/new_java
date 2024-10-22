package org.example.quiz.cast;

import java.util.HashMap;
import java.util.Set;

public class q2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(100, "김데이");
        map.put(200, "김사전");
        map.put(300, "김구조");
        map.put(400, "김자료");

        map.remove(200);
        map.replace(300, "김충성");
        System.out.println("고객의 전체 리스트 : ");

        Set keys = map.keySet();
        for (Object X : keys) {
            System.out.println("고객번호 : " + X + ", 이름 : " + map.get(X));
        }
    }
}
