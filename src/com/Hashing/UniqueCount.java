package com.Hashing;

import java.util.HashSet;

public class UniqueCount {
    public static void main(String[] args) {
        int []nums = {2, 6, 3, 2, 7, 3, 8};
        System.out.println(count(nums));

    }
    public static int count(int [] nums){
        HashSet<Integer>set = new HashSet<>();
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            count++;
        }
        return count;
    }
}
