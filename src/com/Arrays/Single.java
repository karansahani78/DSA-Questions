package com.Arrays;

public class Single {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 5, 4, 3, 2, 1};
        System.out.println(single(nums));  // Output will be 1
    }

    public static int single(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            // Start j from i + 1 to compare the current element with all elements after it
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    found = true;  // Found a duplicate, so break
                    break;
                }
            }
            // If no match was found (no duplicates), return the unique number
            if (!found) {
                return nums[i];  // This is the unique number
            }
        }
        return -1;  // If no unique number found
    }
}
