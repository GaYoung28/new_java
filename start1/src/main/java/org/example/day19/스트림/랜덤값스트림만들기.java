package org.example.day19.스트림;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class 랜덤값스트림만들기 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.rangeClosed(1,100).sum() //1~100 까지 더하기
        );
        System.out.println(
                IntStream.range(1,100).sum() // 1~99 (마지막값 포함X) 더하기
        );

        Random r = new Random();
        int result = r.ints(100,1,100).distinct().sum();
        System.out.println(result);

        //r.ints(100,1,100).sorted.forEach(System.out::println);
        r.doubles(2000,0,100).distinct().sorted().forEach(System.out::println);

        DoubleStream ds = r.doubles(2000,0,100);

        long count = ds.distinct().count();
        System.out.println("중복 제거한 개수>> " + count + "개");
        //DoubleStream ds2 = ds.distinct().sorted();
       // ds.forEach(System.out::println);

        r.ints(100,1,100)
                .sorted().forEach(System.out::println);

    }
}
