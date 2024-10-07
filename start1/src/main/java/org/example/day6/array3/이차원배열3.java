package org.example.day6.array3;

import javax.swing.*;

public class 이차원배열3 {
    public static void main(String[] args) {
        // 전체 프레임이 필요
        // new를 이용해서 부품을 만들어 램에 넣어둠.

        JFrame f = new JFrame();
        f.setSize(300,300);

        String[] title = {"장소", "누구와", "언제"};
        String[][] content = {
                {"부산", "동생", "오전출발"},
                {"대구", "친구", "오후출발"},
                {"광주", "동료", "저녁출발"},

        };

        JTable table = new JTable(content, title);
        JScrollPane pane = new JScrollPane(table);
        f.add(pane);


        // 맨 끝에!!
        f.setVisible(true); // 보이는 것 설정


    }
}
