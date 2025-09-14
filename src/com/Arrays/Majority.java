package com.Arrays;

public class Majority {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count=0;
        int maj =0;
        for(int i = 0; i<nums.length; i++){
            if(count==0){
                maj =nums[i];
            }
            if(maj==nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return maj;
    }
}
