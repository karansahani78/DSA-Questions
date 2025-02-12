package com.Revision;

import java.util.Arrays;

public class CopyArr {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5,6};
        // task create new array and copy the values
        System.out.println(Arrays.toString(Copy(nums)));
    }
    public static int []Copy(int[] nums) {
        int[] newArr = new int[nums.length];
        // traversing and copying the element
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }
        return newArr;
    }
}
