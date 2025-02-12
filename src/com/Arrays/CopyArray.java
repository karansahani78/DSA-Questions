package com.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[]  nums={1,2,3,4,5,6,7,8,9};
        int[] newArray = new int[nums.length];
        // copying using loop
        for(int i=0; i<nums.length; i++){
            newArray[i]=nums[i];
            System.out.print(newArray[i]+" ");
        }
    }
}
