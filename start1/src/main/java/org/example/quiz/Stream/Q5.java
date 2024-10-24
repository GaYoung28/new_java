package org.example.quiz.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        //1.
        int[]arr = {1,2,3,3,4,4,5,5,6,8};
        List<Integer> list = Arrays.stream(arr).filter(a -> a >3)
                .distinct().boxed().collect(Collectors.toList());
        System.out.println(list);

        //2.
        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};
        System.out.println(Arrays.stream(arr2).sum());

        //3.
        String[]arr3 = {"정신과", "내과", "신경과", "정형외과"};
        List<String> list2 = Arrays.stream(arr3).map(b -> b + "사무실").collect(Collectors.toList());
        System.out.println(list2);
    }
}
