package com.SlidingWindow;

public class NiceSubArrayBetter {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        System.out.println(numberOfSubarrays(nums, 3));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int result = 0;
        int start = 0;
        int oddCount = 0;
        int countPrefix = 0;  // To count subarrays with exactly k odd numbers

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] % 2 != 0) {
                oddCount++;
                countPrefix = 0;  // Reset prefix count when a new odd number is found
            }

            while (oddCount == k) {
                if (nums[start] % 2 != 0) {
                    oddCount--;
                }
                start++;
                countPrefix++;  // Count subarrays ending at 'end' with exactly k odd numbers
            }

            result += countPrefix;  // Add valid subarrays ending at 'end'
        }

        return result;
    }
}
