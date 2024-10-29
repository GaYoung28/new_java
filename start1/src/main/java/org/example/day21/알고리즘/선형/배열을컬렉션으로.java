package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로 {
    public static void main(String[] args) {
        String[] s = {"a", "b", "c"};
        //배열을 리스트로 변경하는 방법
        //1.리스트 만들어서 배열 --> 리스트로 옮긴다.
        List<String> list1 = new ArrayList<>();
        for (String x : s) {
            list1.add(x);
        }
        System.out.println(list1);

        //2.배열을 바로 list로 만든다. asList()
        List<String> list2 = Arrays.asList(s);
        System.out.println(list2);
        //list2.add("추가");
        //list2.remove(0);
        //---> 길이 조정하는 add , remove는 사용 불가능
        list2.set(0, "바꾸는 스트링");
        //---> 값은 변경 가능
        System.out.println(list2);

        //3. 가변이 가능한 list로 만들고 싶은 경우
        // --> 배열 데이터를 가지고 새로운 리스트로 만들기
        List<String> list3 = new ArrayList<>(Arrays.asList(s));
        list3.add("추가");
        list3.remove(0);
        System.out.println(list3);


        //배열을 리스트로 만드는 방법 3가지

        Integer[] x = {1, 2, 3, 4, 5};
        //1. x배열의 원소에 10을 곱해서 역순으로 정렬하여 프린트(1번 방법으로)
        //1-1. x배열의 원소를 하나씩 꺼내서 10을 곱한 후 list에 모으세요.
        List<Integer> list4 = new ArrayList<>();
        for (int a : x) {
            list4.add(a * 10);
        }
        //    1-2. Collections.reverse()로 역순으로 정렬\
        Collections.reverse(list4);
        //    1-3. 프린트
        System.out.println(list4);



        //2. x배열의 원소에 뒤에 6, 7을 각각 추가하여 목록을 프린트
        //   (3번 방법으로)
        //    2-1. x배열로 list를 생성
        List<Integer> list5 = new ArrayList<>(Arrays.asList(x));
        //    2-2. 6과 7을 추가후 목록 프린트
        list5.add(6);
        list5.add(7);
        System.out.println(list5);








    }
}
