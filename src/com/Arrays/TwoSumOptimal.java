package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        System.out.println(Arrays.toString(sum(nums,9)));

    }
    public static int[] sum(int [] nums, int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            } map.put(nums[i],i);
        }
        throw new IllegalArgumentException("result not match!");
    }
}
