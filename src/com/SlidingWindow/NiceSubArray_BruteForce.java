package com.SlidingWindow;

public class NiceSubArray_BruteForce {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        System.out.println(numberOfSubarrays(nums,3));

    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int result =0;
        /*
        odd = nums%2!=0 it is odd
        generate all the subarray then check if odd if found then increase the odd count
        and if oddcount is greater than k then break do nothing
         */
        for(int start=0; start<nums.length; start++){
            int oddCount =0;
            for(int end = start; end<nums.length; end++){
                if(nums[end]%2!=0){
                    oddCount++;
                }
                if(oddCount==k){
                    result++;
                }
                if(oddCount>k) {
                    break;
                }
            }
        }
        return result;
    }

}
