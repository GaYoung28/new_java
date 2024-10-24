package org.example.quiz.Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q8 {
    public static void main(String[] args) {
        //1.
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr).filter(x -> x % 2 == 1).sum());

        //2.
        int[] arr2 = {5,3,10,40,2};
        System.out.println(Arrays.stream(arr2).max().getAsInt());

        //3.
        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};
        System.out.println(Arrays.stream(arr3).filter(x -> x > 5).distinct().boxed().collect(Collectors.toList()));
    }
}
