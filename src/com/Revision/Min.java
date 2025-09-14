package com.Revision;

public class Min {
    public static void main(String[] args) {
        int[] nums ={10,11,12,13,3,4,5,89,59};
        System.out.println(Min(nums));

    }
    public static int Min(int[] nums){
        int min=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<min){
                min =nums[i];
            }
        }
        return min;
    }
}
