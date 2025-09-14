package com.Arrays;

public class SecondMaximum {
    public static void main(String[] args) {
        int []nums = {98,99,100,20,24,26,18,30};
        System.out.println(secondMax(nums));

    }
    public static int secondMax(int[]nums){
        int max = nums[0];
        int secondMax=nums[1];
        // now check i second max is greater than max
        if(secondMax>max){
            int temp=secondMax;
            secondMax=max;
            max=temp;
        }
        for(int i=2; i<nums.length; i++){
            if(nums[i]>max){
                secondMax=max;
                max=nums[i];
                // now what if nums[i] is greater than secondmax and less than max
            } else if(nums[i]>secondMax && nums[i]<max){
                secondMax=nums[i];
            }
        }
        return secondMax;
    }
}
