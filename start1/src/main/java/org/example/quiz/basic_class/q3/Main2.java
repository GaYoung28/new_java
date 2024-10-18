package org.example.quiz.basic_class.q3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();


        Scanner sc = new Scanner(System.in);
        System.out.println("책제목, 작가, isbn을 순서대로 입력>>");
        //book1.setTitle(sc.nextLine());
        //book1.setAuthor(sc.nextLine());
        //book1.setIsbn(sc.nextLine());
        //book2.setTitle(sc.nextLine());
        //book2.setAuthor(sc.nextLine());
        //book2.setIsbn(sc.nextLine());

        Book[] books = {book1, book2};
        for (int i = 0; i < 2 ; i++) {
            books[i].setTitle(sc.nextLine());
            books[i].setAuthor(sc.nextLine());
            books[i].setIsbn(sc.nextLine());
        }


        System.out.println("---- 등록된 도서관 책 목록 ----");
        book1.displayInfo();
        book2.displayInfo();


        sc.close();


    }
}
