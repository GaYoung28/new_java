package org.example.day20.알고리즘.문제;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // 1. { 11, 55, 33, 22, 44 } 중 두 수를 곱해서 나올 수 있는 최대값은?
        int[] nums = {11,55,33,22,44};
        Arrays.sort(nums);
        int max = nums[nums.length-1] * nums[nums.length-2];
        System.out.println(max);
    }
}
