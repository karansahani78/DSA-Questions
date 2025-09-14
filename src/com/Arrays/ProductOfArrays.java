package com.Arrays;

public class ProductOfArrays {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Poduct(nums));

    }
    public static int Poduct (int [] nums){
        int product = 1;
        for(int i=0; i<nums.length; i++){
            product = product*nums[i];
        }
        return product;
    }
}
