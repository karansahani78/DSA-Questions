package com.SubArrays;

public class MaxSubArr {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        subArr(nums); // Call the method to print all subarrays
    }

    public static void subArr(int[] nums) {
        // Outer loop to mark the start of the subarray
        for (int i = 0; i < nums.length; i++) {
            // Inner loop to mark the end of the subarray
            for (int j = i; j < nums.length; j++) {
                // Loop to print elements from start (i) to end (j)
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " "); // Print element
                }
                System.out.println(); // Move to the next line after printing a subarray
            }
        }
    }
}
