package com.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Range(nums,0 ,5));

    }
    public static int Range(int[]nums, int start , int end){
        // write edge cases here for an example
        if(nums==null){
            return -1;
        }
        int max =nums[0];
        for(int i=start; i<=end; i++){
            if(nums[i]>max){
                max =nums[i];
            }
        }
        return max;
    }
}
