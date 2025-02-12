package com.Arrays;

import java.util.Arrays;

public class BruteForceSecondMax {
    public static void main(String[] args) {
        int [] nums = {5,6,7,1,2,3,9,10};
        System.out.println(secondMax(nums));

    }
    public static int secondMax(int [] nums){
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            return nums[nums.length-2];
        }
        return -1;

    }
}
