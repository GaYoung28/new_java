package org.example.day11.스태틱static;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] n = {3, 5, 7, 9, 1};
        //정렬! 오름차순!

        Arrays.sort(n); // 파괴형 메서드 ( void --> 변수에 넣으면 X)
        System.out.println(Arrays.toString(n));
        System.out.println(n);

        String s = Arrays.toString(n); //비파괴형 메서드
        System.out.println(s);


        Random random = new Random();
        System.out.println(random.nextDouble());

        for (int i = 0; i < 5; i++) {
            double n2 = Math.random();
            System.out.println(n2); // 0~0.9999 double
            System.out.println((int)(n2*10)+1);
        }
        System.out.println(Math.random());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("현재시간 : " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈 : " + result1.format(dtf));

        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("2월 뺄셈 : " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 덧셈 : " + result3.format(dtf));

        LocalDateTime myDateTime = LocalDateTime.of(2000,1,1,0,0,0);
        System.out.println(dtf.format(myDateTime));
        System.out.println(myDateTime.plusYears(18));


        double num = 1234567.89;
        DecimalFormat df;

        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        df =  new DecimalFormat("#,###.0");
        System.out.println(df.format(num));


        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(date));




    }
}
