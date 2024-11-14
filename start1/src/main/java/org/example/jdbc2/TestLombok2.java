package org.example.jdbc2;

import org.example.jdbc2.board.BoardVO;

public class TestLombok2 {
    public static void main(String[] args) {
        BoardVO vo = new BoardVO();

        vo.setNo(1);
        vo.setTitle("와");
        vo.setContent("우와");
        vo.setWriter("abc");

        int no = vo.getNo();
        String title = vo.getTitle();
        String content = vo.getContent();
        String writer = vo.getWriter();

        System.out.println(vo);
    }
}
