package com.SlidingWindow;

public class subArrayProductLessthanK {
    public static void main(String[] args) {
        int [] nums ={10,5,2,6};
        System.out.println(numSubarrayProductLessThanK(nums,100));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count =0;
        int product =1;
        int start =0;
        // generating all the subarrays
        for(int end = start; end<nums.length; end++){
            product = product*nums[end];
            // if the product exceed or more than or equal to k then shrink the window and and reduce the start element product
            while(product>=k && start<=end){
                product = product/nums[start];
                start++;
            }
            // valid window count
            count = count + (end-start+1);
        }
        return count;
    }
}
