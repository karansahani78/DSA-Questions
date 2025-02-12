package com.Arrays;

import java.util.Arrays;

public class SwapTwoIndices {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        // you task is to swap to index 3 and 4 element
        Swap(nums,3,4);
        // now printing using toString
        System.out.println(Arrays.toString(nums));

    }
    public static void Swap(int []nums, int index3, int index4){
        int temp = nums[index3];
        nums[index3]= nums[index4];
        nums[index4]= temp;
    }
}
