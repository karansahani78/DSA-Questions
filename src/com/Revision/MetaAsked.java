package com.Revision;

import java.util.Arrays;

public class MetaAsked {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        // task copy the element in new array
        System.out.println(Arrays.toString(Meta(nums)));

    }
    public static int[] Meta(int [] nums){
        int[] newArr = new int[2*nums.length];
        // lets copy one time from 1 to 4 in new array
        for(int i=0; i<nums.length; i++){
            newArr[i] = nums[i];
        }
        // then copy from 1 to 4 after nums.length
        for(int i=0; i<nums.length; i++){
            newArr[nums.length+i]= nums[i];
        }

        return newArr;
    }


}
