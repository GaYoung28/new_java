package org.example.day19.스트림;

import java.util.*;
import java.util.stream.IntStream;

public class 스트림문제 {
    public static void main(String[] args) {

        //1.
        List<Double> list1 = new ArrayList<>();
        list1.add(1000.0);
        list1.add(2000.0);
        list1.add(3000.0);
        list1.add(4000.0);
        list1.add(5000.0);
        list1.stream().map(x -> x-1000).forEach(System.out::println);


        //2.
        double[] list2 = {11.1, 22.2, 33.3, 44.4};
        System.out.println(Arrays.stream(list2).map(x -> x + 10).sum());


        //3.
        OptionalDouble avg = IntStream.rangeClosed(1500,3500).average();
        //Optional~ : 결과가 있는지 없는지 체크하는 기능까지를 포함하는 객체

        double avg2 = IntStream.rangeClosed(1500,3500).average().orElse(0);
        //average가 없을 때 기본값 0을 설정하면 바로 double로 리턴 가능!

        if(avg.isEmpty()) {
            System.out.println("결과값이 없음");
        }else{
            System.out.println(avg.getAsDouble());
        }

        //4.
        Random r = new Random();
        r.ints(100,3500,4001)
                .distinct().sorted().forEach(System.out::println);
  }
}
