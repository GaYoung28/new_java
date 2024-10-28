package org.example.day20.알고리즘.문제;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        // 2. { 22, -88, -4, 11, 55} 중 두 수를 곱해서 나올 수 있는 최대값은?
        int[] nums = { 22, -88, -4, 11, 55};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int answer;
        int post = nums[nums.length-1] * nums[nums.length-2];
        int pre = nums[0] * nums[1];
        if(post>pre) {
            answer = post;
        } else {
            answer = pre;
        }
        System.out.println(answer);
    }
}
