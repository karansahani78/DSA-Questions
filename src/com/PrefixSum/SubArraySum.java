package com.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2));
        // Expected output: 2 (subarrays [1,1] at different positions)

        // Explanation:
        // Prefix sums for the array [1, 1, 1] are: [1, 2, 3]
        /*
        Approach:
        1. Initialize:
           - ps (prefix sum) = 0
           - result = 0 (to count subarrays with sum equal to 'k')
           - map to store the frequency of prefix sums.

        2. Insert an initial value in the map:
           - map.put(0, 1) means we have seen the prefix sum 0, one time.
             This helps to handle cases where a subarray starting from the beginning meets the goal.

        3. Iterate through the array:
           - For each element, update the prefix sum (ps += nums[i]).
           - Check if (ps - k) exists in the map:
               - If yes, it means there is a subarray ending at the current index with a sum equal to 'k'.
               - Add the frequency of (ps - k) to the result.
           - Update the map with the current prefix sum.

        4. Return the result which contains the count of subarrays with sum equal to 'k'.
        */
    }

    public static int subarraySum(int[] nums, int k) {
        int result = 0;  // To count subarrays with the desired sum
        int ps = 0;       // Prefix sum to keep track of cumulative sums
        Map<Integer, Integer> map = new HashMap<>();  // Map to store frequency of prefix sums

        // Initialize map to handle subarrays starting from the beginning
        map.put(0, 1);

        // Traverse each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Update prefix sum
            ps += nums[i];

            // Check if there exists a previous prefix sum that would form a subarray with the desired sum
            result += map.getOrDefault(ps - k, 0);

            // Update the map with the current prefix sum
            map.put(ps, map.getOrDefault(ps, 0) + 1);
        }

        // Return the count of valid subarrays
        return result;
    }
}
