package com.Arrays;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        // calling my chagneIndex fuction
        changeIndex(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void changeIndex(int []nums){
        nums[0]=12;
    }
}
