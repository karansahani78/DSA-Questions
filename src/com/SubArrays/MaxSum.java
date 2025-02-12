package com.SubArrays;

public class MaxSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(subArr(nums)); // Will print the sum of all elements of all subarrays.
    }

    public static int subArr(int[] nums) {
        int sum = 0; // To store the sum of all subarrays

        // for start
        for (int i = 0; i < nums.length; i++) {
            // for end
            for (int j = i; j < nums.length; j++) {
                // for elements between start and end
                for (int k = i; k <= j; k++) {
                    sum += nums[k]; // Add elements to the sum
                }
            }
        }
        return sum; // Return the total sum after processing all subarrays
    }
}
