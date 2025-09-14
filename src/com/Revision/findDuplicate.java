package com.Revision;

public class findDuplicate {
    public static void main(String[] args) {
        int[] nums ={1,2,3,3,4,4};
        // your task is to return the duplicate element
        System.out.println(duplicate(nums));
    }
    public static int duplicate(int [] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){

                return nums[i];

            }
        }
        return -1;
    }
}
