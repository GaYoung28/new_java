package org.example.day20.알고리즘.문제;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        //4. {66, 33, 55, 22, 11, 66} 중 크기를 기준으로 중앙값은?
        //   배열의 요소의 길이가 짝수일때는 가운데 있는 값들을 찾아
        //   더한 후 2로 나누어서 찾음

        int[] nums =  {66, 33, 55, 22, 11, 66};
        Arrays.sort(nums);

        int center = nums[nums.length / 2];
        int center1 = nums[nums.length / 2 - 1]  ;
        int center2 = (center + center1) / 2;
        System.out.println(center2);
    }
}
