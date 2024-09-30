package org.example.day2.control;

public class 조건문switch2 {
    public static void main(String[] args) {
       //1.
        int month = 9;
        //계절판별
        switch (month) {
            case 1 : case 2 : case 12:
                System.out.println("겨울");
                break;
            case 3 : case 4 : case 5:
                System.out.println("봄");
                break;
            case 6 : case 7 : case 8:
                System.out.println("여름");
                break;
            case 9 : case 10 : case 11:
                System.out.println("가을");
        }


        //2.
        String food = "짬뽕";
        //먹고 싶은 음식이 짬뽕이면 중국집으로
        //               우동이면 분식집으로
        //               감자탕이면 한식으로
        //위에 것에 포함되지 않으면 집에서 먹자.
        switch (food) {
            case "짬뽕":
                System.out.println("중국집");
                break;
            case "우동":
                System.out.println("분식집");
                break;
            case "감자탕":
                System.out.println("한식");
                break;
            default:
                System.out.println("집");
                break;
        }




    }
}


