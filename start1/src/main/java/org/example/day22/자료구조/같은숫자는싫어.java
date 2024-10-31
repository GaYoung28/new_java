package org.example.day22.자료구조;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 0, 1, 1};
        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);
        System.out.println(stack.peek());
        for (int x : array) {
            if (stack.peek() != x) {
                stack.push(x);
            }
        }

        System.out.println(stack);

        //배열에 넣기
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
