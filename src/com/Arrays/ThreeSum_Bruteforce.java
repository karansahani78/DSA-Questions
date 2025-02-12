package com.Arrays;

import java.util.*;

public class ThreeSum_Bruteforce {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        // to store unique element
        Set<List<Integer>> unique = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        // List to store the triplests
                        List<Integer>triplets = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplets);
                        unique.add(triplets);



                    }
                }
            }
        }
        // Conveting set to  ArrayList or List
        return  new ArrayList<>(unique);
    }
}
