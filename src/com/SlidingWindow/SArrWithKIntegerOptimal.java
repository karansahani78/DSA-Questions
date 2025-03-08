package com.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SArrWithKIntegerOptimal {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        System.out.println(subarraysWithKDistinct(nums, 2));
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return countOfSubarrayWithAtMost(nums, k) - countOfSubarrayWithAtMost(nums, k - 1);
    }

    public static int countOfSubarrayWithAtMost(int[] nums, int k) {
        int count = 0;
        int start = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int end = 0; end < nums.length; end++) {  // Fixed: starting 'end' from 0 directly
            // Expansion phase: adding to the map
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            // Shrinking phase
            while (map.size() > k) {
                map.put(nums[start], map.get(nums[start]) - 1);
                if (map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }
                start++;
            }

            // Calculating the valid  subarrays count
            count += (end - start + 1);
        }
        return count;
    }
}
