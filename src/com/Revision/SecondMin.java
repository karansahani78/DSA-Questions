package com.Revision;

public class SecondMin {
    public static void main(String[] args) {
        int[] nums ={12,12,11,10,14,8,9,7,6};
        System.out.println(secondMin(nums));

    }
    public static int secondMin(int[] nums){
        int min =nums[0];
        int secondMin = nums[1];
        // min should be less than secondMin
        if(min>secondMin){
            int temp = secondMin;
            secondMin=min;
            min=temp;
        }
        for(int i=2; i<nums.length; i++){
            if(nums[i]<min){
                //previouse min become second min
                secondMin=min;
                // then new min updated
                min = nums[i];
            } else if(nums[i]<secondMin && nums[i]>min){
                secondMin=nums[i];
            }
        }
        return secondMin;
    }
}
