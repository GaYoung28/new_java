package org.example.day22.문제풀이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열컬렉션변환{
    public static void main(String[] args) {
        String[] s3 = {"박명수", "유재석", "김종국", "송지효", "하하" };
        //1. 오름차순 정렬해서 프린트
        //2. 내림차순 정렬해서 프린트
        //3. 글자수가 3미만인 사람 삭제후 프린트
        //4. 유재석을 찾아서 유재돌로 변경한 후 프린트
        //5. 전체 목록에 “김종민"을 3번째에 추가한 후 프린트

        //List<String> list = Arrays.asList(s3); ----> 길이 조절 불가능 (remove, add 불가능)

        List<String> list = new ArrayList<>(Arrays.asList(s3)); // --> 길이 조정 가능
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < 3) {
                list.remove(i);
            }
        }
        System.out.println(list);

//        for(String x : list){
//            if(x.length()<3) {
//                list.remove(x);
//            }
//        }

        list.set(0,"유재돌");
        System.out.println(list);
        list.add(2,"김종민");
        System.out.println(list);
    }
}
