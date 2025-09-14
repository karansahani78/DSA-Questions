package com.SubArrays;

public class MaxSumBetterSolution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(max(nums));
    }

    public static int max(int[] nums) {
        int max = nums[0];
        // for start
        for (int start = 0; start < nums.length; start++) {
            // end
            int currentMax = 0;
            for (int end = start; end < nums.length; end++) {
                currentMax = currentMax + nums[end];
                if (currentMax > max) {
                    max = currentMax;

                }
            }

        }
        return max;
    }
}
//! time complexity of this solution is O(n^2)
