package org.example.day20.알고리즘.문제;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        // 3. {66, 33, 55, 22, 11} 중 크기를 기준으로 중앙값은?
        //   배열의 요소의 길이가 홀수일때는 가운데 있는 값을 찾음.

        int[] nums =  {66, 33, 55, 22, 11};
        Arrays.sort(nums);
        int center = nums[nums.length / 2];
        System.out.println(center);
    }
}
