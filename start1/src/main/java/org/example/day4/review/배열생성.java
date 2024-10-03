package org.example.day4.review;

public class 배열생성 {
    public static void main(String[] args) {
        //배열을 생성할 때
        // 1. 처음부터 값을 알고있는 경우
        int[] days = {1, 3, 4, 5, 6};

        // 2. 처음에는 값을 모르고 있는 경우
        String[] doing = new String[5]; // 1차원배열은 고정이라 배열 크기 무조건 할당해줘야함
        // String 자동초기화 {null, null, null,...}
        doing[0] = "쉬기"; // String --> "", char --> '
        doing[1] = "서울숲";
        System.out.println(days); // --> 주소 출력 (주소를 통해 cpu가 변수에 접근)
        System.out.println(doing);

        double[] temp = {22, 20, 15, 17, 19};
        //System.out.println(days[0] + " " + doing[0] + " " + temp[0]); //같은 형태일때만 묶어서 사용가능
        //System.out.println(days[1] + " " + doing[1] + " " + temp[1]); //같은 형태일때만 묶어서 사용가능

        for (int i = 0; i < temp.length; i++) {
            System.out.println(days[i] + " " + doing[i] + " " + temp[i]); //같은 형태일때만 묶어서 사용가능

        }
        //간단하지만 기능이 꺼내오는 용도로만 사용 가능하다.
        for(double t : temp){//temp라는 배열을 앞에서부터 순서대로 있는지 체크해서 하나씩 꺼내어
            //t라는 변수에 넣어주는 for 문(for-each문)
            //temp는 double이므로 배열 타입에 맞게 사용해야함
            //t라는 변수는 하나 만들어서 계속 사용하는 변수 , 5번 사용됨
            System.out.println(t);

        }
    }
}
