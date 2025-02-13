package com.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class Sum {
    public static void main(String[] args) {
        int [] nums = {7,2,3,5,6,7,8};
        System.out.println(Arrays.toString(Sum(nums,10)));
    }
    public static int []Sum(int[] nums, int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
               int complementIndex= map.get(complement);
                return new int []{complementIndex,i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

    }
}
