package com.Revision;

import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        rotate(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int [] nums){
        int temp = nums[0];
        for(int i=1; i<nums.length-1; i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;
    }
}
