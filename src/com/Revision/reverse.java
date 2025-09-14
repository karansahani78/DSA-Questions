package com.Revision;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(reverse(nums)));
    }
    public static int [] reverse(int [] nums){
        int start =0;
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
        return nums;
    }

}
