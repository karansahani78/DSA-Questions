package com.Arrays;

import java.util.Arrays;

public class SecondLarget {
    public static void main(String[] args) {
        int[] nums = {10,12,9,8,7,16,17,90,87,65};
        System.out.println(SecondLarget(nums));

    }

    public static int SecondLarget(int[] nums) {
        int max = nums[0];
        int secondMax = nums[1];
        // ensure the max is greater thand second max
        if(secondMax>max){
            int temp =secondMax;
            secondMax=max;
            max=temp;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] < max) {
            secondMax = nums[i];
        }
        }
        return secondMax;
    }
}
