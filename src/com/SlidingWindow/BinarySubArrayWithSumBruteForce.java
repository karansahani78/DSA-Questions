package com.SlidingWindow;

public class BinarySubArrayWithSumBruteForce {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        System.out.println(numSubarraysWithSum(nums,2));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        // generating sub strings then calculating sum if == goal then return the count of the substring
        int count=0;
        for(int start=0; start<nums.length; start++){
            int sum =0;
            for(int end = start; end<nums.length; end++){
                sum+=nums[end];
                if(sum==goal){
                    count++;
                }
            }
        }
        return count;
    }
}
