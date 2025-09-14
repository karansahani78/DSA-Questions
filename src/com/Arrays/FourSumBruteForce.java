package com.Arrays;

import java.util.*;

public class FourSumBruteForce {
    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums));
    }
    public static List<List<Integer>> fourSum(int[] nums){
        int n =nums.length;
        // to store unique value
      Set<List<Integer>> unique = new HashSet<>();
      for(int i=0; i<n; i++){
          for(int j=i+1; j<n; j++){
              for(int k=j+1; k<n; k++){
                  for(int l =k+1; l<n; l++){
                      if(nums[i]+nums[j]+nums[k]+nums[l]==0){
                          // creating a List to store quadruplets
                          List<Integer>quadruplets = Arrays.asList(nums[i], nums[j],nums[k],nums[l]);
                          // sorting to reduce duplicacy
                          Collections.sort(quadruplets);
                          // adding to the HashSet
                          unique.add(quadruplets);
                      }
                  }
              }
          }
      }
      // returning hashset as list
        return new ArrayList<>(unique);

    }
}