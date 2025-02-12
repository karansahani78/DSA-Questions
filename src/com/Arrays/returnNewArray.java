package com.Arrays;

import java.util.Arrays;

public class returnNewArray {
    public static void main(String[] args) {
        int[] nums ={10,11,12,13,14,15,16,17,18,19};
        int[] newArray = new int[nums.length];
            Copy(nums,newArray);
        System.out.println(Arrays.toString(newArray));

    }
    public static int[] Copy(int[] nums, int[] newArray){
        for(int i=0; i<nums.length; i++){
            newArray[i]=nums[i];
        }
        return newArray;
    }
}
