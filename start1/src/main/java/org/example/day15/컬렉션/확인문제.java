package org.example.day15.컬렉션;

import java.util.*;

public class 확인문제 {
    public static void main(String[] args) {
        // p.51 컬렉션 확인문제

        // 1. Set
        HashSet tour = new HashSet();
        tour.add("제주도");
        tour.add("부산");
        tour.add("울릉도");
        tour.add("일본");
        tour.add("대만");
        System.out.println(tour);

        //반복문 이용해서 하나씩 꺼내와서 처리
        //set은 순서 x, 인덱스 없음 --> 인덱스 없어도 for-each는 가능.
        for (Object x : tour) {
            System.out.println(x);
        }
        //반복해서 꺼내주는 부품을 달아주세요.
        //반복자 (iterator,이터레이터)
        Iterator it = tour.iterator();
        while (it.hasNext()) {
            //꺼내줄것 있는지 체크먼저 해야함.
            Object x = it.next(); //꺼내줌.
            System.out.println(x);
        }

        System.out.println("---------------------------");



        // 2. map
        HashMap map = new HashMap();
        map.put("안방","TV");
        map.put("거실","쇼파");
        map.put("부엌","냉장고");
        map.put("현관","신발");
        System.out.println(map);
        System.out.println(map.get("현관"));
        System.out.println(map.replace("거실", "책상"));
        System.out.println(map);

        //map은 키목록을 Set으로 먼저 구해서 for-each로 값을 구해줌
        Set keys = map.keySet();
        System.out.println(keys);
        System.out.println(keys.contains("베란다"));
        Collection values = map.values();
        System.out.println(values.contains("스타일러"));
        System.out.println(values.contains("TV"));
        for (Object x : keys) {
            System.out.println(x + " : " + map.get(x));
        }

        System.out.println("---------------------------");



        // 3. list
        ArrayList list = new ArrayList();
        list.add("먹기");
        list.add("잠자기");
        list.add("놀기");
        list.add("공부하기");
        list.add("티비보기");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        list.set(1,"청소");
        System.out.println(list);

        LinkedList list2 = new LinkedList();
        list2.add("수업듣기");
        list2.add("문제풀기");
        list2.add("밥먹기");
        list2.add("오후수업");
        list2.add("문제풀기2");
        System.out.println(list2);

        // 순서 있음 . 인덱스 가지고 있음 -> for문 사용 가능
        //반복문 이용해서 하나씩 꺼내와서 처리 -> 3가지 방법
        //인덱스 존재하지 않으면 2)와 3) 방법 사용

        // 1)
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        // 2)
        for (Object x : list2) {
            System.out.println(x);
        }

        // 3)
        //반복자 (iterator,이터레이터)
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }
}
