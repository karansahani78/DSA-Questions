package com.Arrays;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int [] nums = {1,1,1};
        System.out.println(SubArrays(nums,2));

    }
    public static int SubArrays(int [] nums, int k) {
        // generating all the sub arrays first
        int count =0;
        for (int st = 0; st < nums.length; st++) {
            int sum = 0;
            for (int ed = st; ed < nums.length; ed++) {
                for (int s = st; s <= ed; s++) {
                    sum = sum + nums[s];
                    if(sum==k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
