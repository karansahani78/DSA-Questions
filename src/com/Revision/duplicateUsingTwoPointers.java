package com.Revision;

public class duplicateUsingTwoPointers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        System.out.println(count(nums)); // Output will be 4
    }

    public static int count(int[] nums) {
        int dup = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    dup++;
                    break;
                }
            }
        }

        return dup;
    }
}
