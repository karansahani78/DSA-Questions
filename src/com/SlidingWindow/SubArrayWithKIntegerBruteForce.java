package com.SlidingWindow;

import java.util.HashSet;

public class SubArrayWithKIntegerBruteForce {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        System.out.println(subarraysWithKDistinct(nums,2));
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        int count =0;
        /*
        generating all the sub array
        adding to the hashset then if hashset size == k the increase the counter if size> k then break
         */
        for(int start=0; start<nums.length; start++){
            HashSet<Integer> set = new HashSet<>();
            for(int end = start; end<nums.length; end++){
                set.add(nums[end]);
                if(set.size()==k){
                    count++;
                }
                if(set.size()>k){
                    break;
                }
            }
        }
        return count;
    }
}
