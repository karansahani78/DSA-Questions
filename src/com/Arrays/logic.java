package com.Arrays;

public class logic {
    public static void main(String[] args) {
        int[] nums = {98, 99, 100, 20, 24, 26, 18, 30};
        System.out.println(M(nums));
    }

    public static int M(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // Finding max and second max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;  // Store previous max as second max
                max = nums[i]; // Update max
            } else if (nums[i] > smax && nums[i] < max) {
                smax = nums[i]; // Update second max
            }
        }

        return smax;
    }
}
