package com.Revision;

import java.util.Arrays;

public class countDuplicate {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,4,3,2};
        System.out.println(count(nums));

    }
    public static int count(int [] nums){
        int dup=0;
        // first sort the array
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                dup++;

            }
        }
        return dup;
    }
}
