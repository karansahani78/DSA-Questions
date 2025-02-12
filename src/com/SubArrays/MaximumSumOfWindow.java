package com.SubArrays;

public class MaximumSumOfWindow {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6,7,8,9};
        System.out.println(Max(nums,4));
    }

    public static int Max(int[] nums,int k) {
        int start = 0;
        int end = k;
        // calulating current window sum
        int currentWindoSum = 0;
        for (int i = start; i <end; i++) {
            currentWindoSum += nums[i];
        }
        // next window sum
        int maxSum = currentWindoSum;
        for (int i = end + 1; i < nums.length; i++) {
            currentWindoSum = currentWindoSum - nums[start] + nums[i];
            start++;
            if (currentWindoSum >maxSum) {
                maxSum = currentWindoSum;
            }
        }
        return maxSum;


    }
}