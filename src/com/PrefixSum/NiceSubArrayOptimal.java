package com.PrefixSum;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Map;

public class NiceSubArrayOptimal {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        System.out.println(numberOfSubarrays(nums,3));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int result =0;
        int oddCount =0;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            // calculating oddCount
            if(nums[i]%2!=0){
                oddCount++;
            }
            // adding to the result how many times we got oddCount-k
            result+= map.getOrDefault(oddCount-k,0);
            // updating the map
            map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }
        return result;
    }
}