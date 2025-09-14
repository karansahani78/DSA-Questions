package com.Revision;

import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 4, 0, 5, 0, 6};
        int [] arr = move(nums);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] move(int [] nums){
        // creating new array
        int[] arr = new int[nums.length];
        // intializing index for new array
        int index =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                arr[index]=nums[i];
                index++;
            }
        }
        return arr;

    }
}