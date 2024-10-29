package org.example.day21.알고리즘.스트링;

public class 스트링심화 {
    public static void main(String[] args) {
        String s = "퐁퐁";
        String s2 = "퐁퐁";
        System.out.println(s);
        System.out.println(s2);

        //참조형이 가르키고 있는 값을 비교
        System.out.println(s.equals(s2));
        //참조형 변수내에 들어있는 주소를 비교
        System.out.println(s == s2);
        s2 = "하하";
        System.out.println(s == s2);
        s2 = "홍홍";

        //String은 값이 자꾸 변할 때 새로운 주소를 할당하기 때문에 사용하면 X
        // ==> 스트링이 값이 자꾸 변할 때는 StringBuilder를 쓸 것.
        StringBuilder sb = new StringBuilder();
        sb.append("하하하하1");
        sb.append("하하하하2");
        sb.append("하하하하3");
        System.out.println(sb);

        sb.replace(0,4,"호호호호");
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);

        sb.deleteCharAt(0); // 특정 인덱스만
        System.out.println(sb);

        System.out.println(sb.indexOf("2"));

        sb.insert(1,"왕"); //중간에 삽입
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String result = sb.toString();
        System.out.println(result);

        String[] s3 = {"나는 ", "홍길동", "이다."};
        //하나로 모아보세요.! ==> StringBuilder에 모아서 String으로 옮기기!
        String s4 = "";

        StringBuilder sb2 = new StringBuilder();
        for (String x : s3) {
            sb2.append(x);
            System.out.println(sb2.hashCode()); //hashCode : 주소 알 수 있음.
            // StringBuilder는 String과 다르게 주소값 바뀌지 않음
        }
        System.out.println(sb2);

    }
}
