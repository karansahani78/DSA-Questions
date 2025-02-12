package com.Arrays;

public class Minumum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,65,6,6,7,7,78,8,8,89};
        System.out.println(Min(nums));

    }
    public static int Min(int[]nums){
        int min =nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}
