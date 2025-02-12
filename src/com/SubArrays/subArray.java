package com.SubArrays;

public class subArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        SubA(nums);

    }

    public static void SubA(int[] nums) {
        // for start
        for (int i = 0; i < nums.length; i++) {
            // for end
            for(int j=i; j<nums.length; j++){
                // to print the element between start and end
                for(int k=i; k<=j; k++){
                    System.out.print(nums[k]);
                }
                System.out.println();
            }

        }
    }
}