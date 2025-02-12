package com.Arrays;

import java.util.*;

public class ThreeSumBetter {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            // to check uniqueness
            Set<Integer> seen = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int k = -(nums[i]+nums[j]);
                if(seen.contains(k)){
                    List<Integer>triplets = Arrays.asList(nums[i], nums[j],k);
                    Collections.sort(triplets);
                    result.add(triplets);
                }
                seen.add(nums[j]);

            }
        }
        return  new ArrayList<>(result);
    }
}