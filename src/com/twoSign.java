package com;

import java.util.Arrays;

public class twoSign {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, -6, -7, -8};
        System.out.println(Arrays.toString(two(nums)));
    }

    public static int[] two(int[] nums) {
        int[] Arr = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >0) {
                Arr[pos] = nums[i];
                pos += 2;
            } else{
                Arr[neg] = nums[i];
                neg += 2;
            }
        }
        return Arr;
    }
}


