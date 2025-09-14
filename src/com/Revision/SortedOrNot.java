package com.Revision;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        // task return 0 if sorted in non-descending order and 1 if not
        System.out.println(Sort(nums));
    }
    public static int Sort(int [] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                // it means that it is not sorted in ascending order because i+1 is less than i
                return 1;
            }
        }
        return 0;

    }
}
