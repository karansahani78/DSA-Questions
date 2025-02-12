package com.Revision;

public class Max {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,1,2,3,98,0,1};
        System.out.println(Max(nums));


    }
    public static int Max(int []nums){
        int max =nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max =nums[i];
            }
        }
        return max;
    }
}
