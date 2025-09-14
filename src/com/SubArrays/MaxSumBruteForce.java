package com.SubArrays;

public class MaxSumBruteForce {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Max(nums));
    }
    public static int Max(int [] nums){
        int max =nums[0];
        // for start
        for(int i=0; i<nums.length; i++){
            // for end
            for(int j=i; j<nums.length; j++){
                // creating a variable to store current sum
                int currentSum =0;
                // to print or add the element between i and j
                for(int k=i; k<=j; k++){
                    currentSum=currentSum+nums[k];
                }
                if(currentSum>max){
                    max = currentSum;
                }

            }
        }
        return max;
    }
}
// ! it has time complexity of O(n^3)