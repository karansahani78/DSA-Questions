package com.SlidingWindow;

public class ConstantWindow {
    public static void main(String[] args) {
        // maximum sum of window
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maxSum(nums,4));
    }

    public static int maxSum(int[] nums, int k) {
        int start = 0;
        int end = k - 1;
        int sum = 0;
        for (int i = start; i <=end; i++) {
            sum = sum + nums[i];
            }
        int maxSum = sum;
        for (int i = end + 1; i < nums.length; i++) {
            sum= sum-nums[start] + nums[i];
            start++;
            if(sum>maxSum){
                maxSum= sum;
            }



        }
        return maxSum;
    }
}
