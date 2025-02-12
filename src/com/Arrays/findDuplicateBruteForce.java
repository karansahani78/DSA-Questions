package com.Arrays;

import java.util.Arrays;

public class findDuplicateBruteForce {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 9, 4, 3, 5, 10, 11, 12};
        System.out.println(duplicate(nums));
    }

    public static int duplicate(int[] nums) {
        // Brute-force approach to find duplicate
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i]; // Return the duplicate value
                }
            }
        }
        return -1; // Return -1 if no duplicate is found
    }
}
