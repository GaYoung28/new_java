package org.example.day19.스트림;

import java.util.*;

public class 스트림문제2 {
    public static void main(String[] args) {
        //1. 정수값 100개를 111~222까지 랜덤하게 스트림을 만들어서
        //    최대값, 최소값, 합계, 평균을 구하시오.
        Random r = new Random();
        OptionalInt max = r.ints(100,111,222).max();
        System.out.println(max.getAsInt());

        OptionalInt min = r.ints(100,111,222).min();
        System.out.println(min.getAsInt());

        int sum = r.ints(100,111,222).sum();
        System.out.println(sum);

        OptionalDouble avg = r.ints(100,111,222).average();
        System.out.println(avg.getAsDouble());


        System.out.println("------------------------------------");



        //2. 실수값 200개를 11.1~55.5까지 랜덤하게 스트림을 만들어서
        //    전체 개수, 맨 앞에 있는 값, 평균을 구하시오.
        Random r2 = new Random();
        double count = r2.doubles(200,11.1,55.5).count();
        System.out.println(count);

        OptionalDouble first = r2.doubles(200,11.1,55.5).findFirst();
        System.out.println(first.getAsDouble());

        OptionalDouble avg2 = r2.doubles(200,11.1,55.5).average();
        System.out.println(avg2.getAsDouble());


        System.out.println("------------------------------------");




        //3. 먹고 싶은 음식 7개를 List<String>에 넣은 후,
        //   스트림으로 만들고 글자가 3글자 이상인 것 들만 모아서
        //   프린트

        List<String> list = Arrays.asList("커피", "붕어빵", "오렌지", "아이스크림", "빙수", "고구마", "토마토");
        list.stream().filter(x -> x.length() >= 3).forEach(System.out::println);


        System.out.println("------------------------------------");



        //4. 가고 싶은 곳 5개(산 2개 이상 넣음)를 String[]에 넣은 후,
        //   스트림으로 만들고 글자가 "산"으로 끝나는 것을 모아 중간에 한번 출력 후
        //   List<String>으로 모은 후 list를 출력

        String[] place = {"북한산", "한라산", "제주도", "독도", "울릉도"};
////        List<String> list2 = Arrays.stream(place)
////                .filter(x -> x.endsWith("산"))
////                .peek(System.out::println)
//////                .collect(Collectors.toList());
//
//        System.out.println(list2);



        System.out.println("------------------------------------");


        //5. List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);를 스트림으로 만들어
        //   최대값, 최소값, 합계, 평균을 구하시오.

        List<Double> list3 = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);
        double max2 = list3.stream().mapToDouble((Double::doubleValue)).max().orElse(0.0);
        System.out.println(max2);
        //OptionalDouble max2 = list3.stream().mapToDouble(Double::doubleValue).max();
        //System.out.println(max2.getAsDouble());

        double min2 = list3.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
        System.out.println(min2);
        //OptionalDouble min2 = list3.stream().mapToDouble(Double::doubleValue).min();
        //System.out.println(min2.getAsDouble());

        double sum2 = list3.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println(sum2);

        double avg3 = list3.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println(avg3);


        System.out.println("------------------------------------");




        //6. List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);을 스트림으로 만들어
        //   중복을 제거후, 오름차순으로 정렬한 후 최소값을 구하시오

        List<Integer> list4 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);
        int min3 = list4.stream()
                .distinct().sorted()
                .mapToInt(Integer::intValue)
                .min().orElse(0);
        System.out.println(min3);

    }
}
