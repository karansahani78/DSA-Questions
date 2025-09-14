package com.Arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] nums = {10, 11, 12, 13, 14, 15, 16};
        System.out.println(Max(nums));

    }

    public static int Max(int[] nums) {
        int max =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}

