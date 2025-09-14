package com.Arrays;

public class RotateByKthE {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        reverse(nums,0,nums.length-1);
        reverse(nums,0,3-1);
        reverse(nums,3,nums.length-1);

    }
    public static void reverse(int [] nums, int start, int end){
        while(start<end){
            int temp =nums[start];
            nums[end]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}
