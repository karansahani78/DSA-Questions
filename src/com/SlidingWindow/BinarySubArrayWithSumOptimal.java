package com.SlidingWindow;

public class BinarySubArrayWithSumOptimal {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        System.out.println(numSubarraysWithSum(nums, 2));  // Expected Output: 4
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int start = 0, count = 0, sum = 0;

        // Iterate through the array with the 'end' pointer
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];  // Expand the window by adding nums[end]

            // If the sum exceeds the goal, move 'start' forward to reduce the sum
            while (sum > goal && start <= end) {
                sum -= nums[start];  // Shrink the window from the left
                start++;  // Move 'start' pointer ahead
            }

            // Count all valid subarrays ending at 'end'
            int tempStart = start, tempSum = sum;
            while (tempSum == goal && tempStart <= end) {
                count++;  // Each valid subarray contributes to the count
                tempSum -= nums[tempStart];  // Move tempStart ahead
                tempStart++;
            }
        }

        return count;  // Return the total count of valid subarrays
    }
}
