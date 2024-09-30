package org.example.day3.array;

public class Array1 {
    public static void main(String[] args) {
        //배열을 만드는 방법 2가지
        //공간을 여러개 만들 때(배열) 처음에 값을 모르는 경우
        //유한 공간(개수 정해져 있음), 동일한 타입일 때 배열 사용
        int[] s = new int[5]; // {0,0,0,0,0} 배열은 자동 초기화 (정수는 0으로,string은 null로 초기화)==> 초기화된 값의 목록이 생성
        //첫번째 값 ==> s 안에 주소가 가르키고 있는 공간 s[0], 인덱스는 0부터 시작
        //두번째 값 ==> s 안에 주소가 가르키고 있는 공간 s[1]
        System.out.println("첫번째 값 ==> " + s[0]);
        System.out.println("두번째 값 ==> " + s[1]);

        s[0] = 100; // 값 변경
        System.out.println("첫번째 값 ==> " + s[0]);

        //공간을 여러개 만들 때 처음부터 값을 알고 있는 경우
        int[] s2 = {100, 200, 300, 400, 500}; //저장공간은 7개 만들어짐. (s,100,200,300,400,500,5) 5가 저장되어있는 변수 ==> length

        System.out.println("첫번째 값 ==> " + s2[0]);
        System.out.println("두번째 값 ==> " + s2[1]);
        System.out.println(s2.length);


    }
}
