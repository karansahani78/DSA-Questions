package com.Revision;

public class SecondMax {
    public static void main(String[] args) {

        int[] nums = {0, 9, 8, 6, 5, 11, 12, 13, 14, 15, 16};
        System.out.println(SecondMax(nums));

    }

    public static int SecondMax(int[] nums) {
        int max = nums[0];
        int secondmax = nums[1];
        // secondmax should be always less than max
        if (max < secondmax) {
            int temp = secondmax;
            secondmax = max;
            max = secondmax;
        }
        // then traverse to the length of the nums
        for (int i = 2; i < nums.length; i++) {
            if (max < nums[i]) {
                secondmax = max;
                max = nums[i];

            } else if (nums[i] > secondmax && nums[i] < max) {
                secondmax = nums[i];
            }
        }
        //! if not found then return -1
        if (secondmax == max) {
            return -1;
        } else {
            return secondmax;
        }
    }
}