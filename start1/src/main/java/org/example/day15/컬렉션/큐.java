package org.example.day15.컬렉션;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {
    public static void main(String[] args) {
        //Queue, 큐, 대기줄
        Queue queue = new LinkedList();
        //순서 + 선입선출(First Input, First Output, FIFO)
        queue.add("어제 우유");
        queue.add("오늘 우유");
        queue.add("내일 우유");
        System.out.println(queue);
        queue.remove(); //맨 앞줄에 있는 요소가 삭제
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
