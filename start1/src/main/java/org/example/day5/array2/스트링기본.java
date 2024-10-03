package org.example.day5.array2;

import java.util.Arrays;

public class 스트링기본 {
    public static void main(String[] args) {
        String s = "나는! 프로그래머야"; //index를 가지고 있음. 나는 0번!
        String s2 = "진짜!!!";
        System.out.println(s + s2);

        String sum = s.concat(s2);
        System.out.println(sum);

        char c = s.charAt(0); // s스트링에 들어있는 것중 0번 index에 있는 char를 추출!
        System.out.println(c);

        char c2 = s2.charAt(2);
        System.out.println(c2);

        System.out.println(s.endsWith("!"));
        System.out.println(s2.endsWith("!"));

        System.out.println(s.contains("!"));
        System.out.println(s2.contains("!"));

        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 9)); //4~8

        //index
        System.out.println(s2.indexOf("!")); //첫번째 위치!


        String s3 = "aliciawill@kakao.com";
        //aliciawill만 추출해주세요.!
        //1-1. @의 위치를 찾는다.
        //1-2. 앞에서부터 @앞까지 추출
        int index = s3.indexOf("@");
        System.out.println(index);
        System.out.println(s3.substring(0, index));
        System.out.println(s3.substring(0, index));
        System.out.println(s3.startsWith("alicia"));

        //s3에 들어있는 것을 대문자로
        System.out.println(s3.toUpperCase());
        //s3에 들어있는 것 중 com을 net으로 변경
        System.out.println(s3.replace("com", "net"));
        //replace()는 램에 있는 데이터를 가져다가 cpu가 변경!
        //ram은 변경되지 않았음.

        s3 = s3.replace("com", "net");
        System.out.println(s3);
        //===> 수동으로 ram에 넣어줌.

        //s3의 전체 글자 수 프린트
        System.out.println(s3.length());

        //길이, 크기ㅣ, 사이즈, 렝스, 개수
        String s4 = "  root";
        String s5 = "감자,고구마,양파";
        String s6 = "ABC";
        String s44 = s4.trim();
        System.out.println(s44.length());
        System.out.println(s44.equals("root"));

        //String을 분리해서 배열에 넣어주기
        String[] data = s5.split(","); //{"감자","고구마","양파"}
        System.out.println(Arrays.toString(data));


        char[] data2 = s6.toCharArray(); //{'a', 'b', 'c'}
        System.out.println(Arrays.toString(data2));


        String all = "국어, 영어, 수학, 컴퓨터";
        //1.
        String[] all2 = all.split(",");

        //2.
        for (int i = 0; i < all2.length; i++) {
            all2[i] = all2[i].trim();
        }

        //3.
        System.out.println(all2.length);
        int count = 0;

        //4
        for (int i = 0; i < all2.length; i++) {
            if (all2[i].equals("컴퓨터")) {
                System.out.println(i);
                if (all2[i].length() < 3) {
                    count++;
                }

            }
            System.out.println(count);


            String tel = "    011-245-1234";

            //1. 양쪽 공백 제거
            tel = tel.trim();
            System.out.println(tel);

            //2. -을 기준으로 분리
            String[] tel2 = tel.split("-");
            System.out.println(Arrays.toString(tel2));

            //3. 첫번째 문자열이 011이면 Sk, 019이면 LG, 나머지이면 Apple

            System.out.println(tel2[0]);
            switch (tel2[0]) {
                case "011":
                    System.out.println("SK");
                    break;
                case "019":
                    System.out.println("LG");
                    break;
                default:
                    System.out.println("Apple");
                    break;
            }

            //4. 두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
            if (tel2[1].length() >= 4) {
                System.out.println("최신폰");
            } else {
                System.out.println("올드폰");
            }

            //5. tel2의 모든 값을 더해서 사용
            int sum2 = tel2[0].length() + tel2[1].length() + tel2[2].length();
            if (sum2 >= 10) {
                System.out.println("유효한 전화번호");
            } else {
                System.out.println("유효하지 않은 전화번호");
            }


        }
    }
}

