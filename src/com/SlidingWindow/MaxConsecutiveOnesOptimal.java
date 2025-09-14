package com.SlidingWindow;

public class MaxConsecutiveOnesOptimal {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(longestOnes(nums,2));
    }

    public static int longestOnes(int[] nums, int k) {
        /*
        intialize max length
        initialize countzero =0
        start =0;
        generate all the sub Arrays
        when index fount 0 increase the counter
        and check if zerocount not more than k
        if zerocount more than zero then decrese it and shrink the window start++
       */
        int maxLength =0;
        int zeroCount =0;
        int start =0; //
        for(int end = start; end<nums.length; end++){
            // we calculating how many 0 are there
            if(nums[end]==0){
                zeroCount++;
            }
            // if 0 greater than k then reducing the zero to k
            if(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
            int currentLength = end -start +1;
            if(currentLength>maxLength){
                maxLength= currentLength;
            }
        }
        return maxLength;
    }
}
