package org.example.day22.자료구조;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        String s = "abcabcdee" ;
        //1.목록에 어떤 문자가 있는지
        //2.그 문자가 몇번이나 나왔는지 찾아야함.
        HashSet<String> set = new HashSet<>(); // 중복 없애기 위해 set 사용
        String[] s2 = s.split("");
        for(String x : s2){
            set.add(x); //중복된 것은 안들어감
        }
        System.out.println(set);
        List<String> list = Arrays.asList(s2);
        System.out.println(Collections.frequency(list, "a"));


        for (String x : set) {
            System.out.println(Collections.frequency(list, "a"));
            if (Collections.frequency(list, "a") > Collections.frequency(list, "b")) {}
        }
    }
}
