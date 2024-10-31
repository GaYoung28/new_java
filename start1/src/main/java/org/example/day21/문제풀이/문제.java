package org.example.day21.문제풀이;

import org.example.ArrPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문제 {
    public static void main(String[] args) {

        //1. String s = "감,배,위"; 각 글자를 추출 후(split())
        //   오름차순으로 정렬하여 String에 넣어 프린트
        String s = "감,배,위";
        String[] ss = s.split(",");
        Arrays.sort(ss);

        StringBuilder sb = new StringBuilder();
        for (String one: ss){
            sb.append(one);
        }

        System.out.println(sb);
        String result = sb.toString();
        System.out.println(result);

        // join -> String배열에 있는 것을 String을 한번에 모아주는 함수.
        String result2 = String.join("", ss);
        System.out.println(result2);



        //2. String[] s2 = {"제주도", "부산", "울릉도"};
        //   다음과 같이 출력되도록 하나의 String으로 묶어서 프린트
        //   나는 제주도 가고 싶다. 나는 부산 가고 싶다. 나는 울릉도 가고 싶다.

        String[] s2 = {"제주도", "부산", "울릉도"};

        StringBuilder sb2 = new StringBuilder();
        for (String x : s2) {
            sb2.append("나는 " + x + " 가고싶다. ");
        }

        System.out.println(sb2.toString());



        //3. String[] s3 = {"제주도", "부산", "울릉도"};
        //   s3 목록에 "울산", "파주", "인천"추가 후, 첫번째 위치에 있는 것 삭제
        //   부산을 마산으로 변경후 하나의 String으로 묶어서 프린트

        String[] s3 = {"제주도", "부산", "울릉도"};

        List<String> list3 = new ArrayList<>(Arrays.asList(s3));
        list3.add("울산");
        list3.add("파주");
        list3.add("인천");
        list3.remove(0);
        list3.set(0,"마산");
        System.out.println(list3.toString());



        //4. String s4 = "마사아차가나"; 오름차순으로 정렬 후 프린트
        String s4 = "마사아차가나";
        char[] c = s4.toCharArray();
        Arrays.sort(c);
        System.out.println(new String(c));
        StringBuilder sb3 = new StringBuilder(new String(c));
        String result3 = sb3.toString();
        System.out.println(result3);



        //5. int[] s5 = {55, 100, 77, 88, 22}를 정렬 후 역순으로 int[] s6에 옮겨 프린트
        int[] s5 = {55, 100, 77, 88, 22};
        Arrays.sort(s5);

        int[] s6 = new int[s5.length];
        int j = s5.length - 1; //마지막 인덱스
        for (int i = 0; i < s5.length; i++){
            s6[j] = s5[i];
            j--;
        }
        ArrPrint.print(s6);

//        List<Integer> list5 = new ArrayList<>();
//        for(int x : s5) {
//            list5.add(x);
//        }
//        Collections.reverse(list5);
//        System.out.println(list5);




        //6. 216페이지 - 특정문자 제거하기
        //7. 226페이지 - 문자열 다루기 기본
        //8. 231페이지 - 서울에서 김서방 찾기
        //9. 242페이지 - 문자 반복 출력하기
        //10. 246페이지 - 문자열 뒤집기
        //11. 191페이지 - 숫자찾기
        //12. 192페이지 문제


    }

}


