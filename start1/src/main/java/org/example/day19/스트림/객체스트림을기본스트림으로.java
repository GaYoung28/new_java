package org.example.day19.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class 객체스트림을기본스트림으로 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300);
        List<Double> list2 = Arrays.asList(100.0, 200.0, 300.0);

        //스트림으로 만들어서
        //평균을 구해보고, 합도 구해보고 최댓값도 구해보자.!

        //방법1
        //Stream<Integer> ==> [주소, 주소, 주소]
        OptionalDouble avg1 = list.stream().mapToInt(Integer::intValue).average();
        if (avg1.isPresent()) {
            System.out.println("평균>> " + avg1.getAsDouble());
        } else{
            System.out.println("평균을 구할 수 없음.");
        }


        //방법2
        double avg2 = list2.stream()
                .mapToDouble(Double::valueOf).average().orElse(0.0); //없을 때 기본값 설정
        System.out.println(avg2);


        //방법3
       list2.stream().mapToDouble(Double::valueOf)
               .average().ifPresent(x -> System.out.println(x)); //없을 때 기본값 설정
        System.out.println(avg2);
    }


}
