package com.Arrays;

import java.util.Arrays;

public class ProductOfArrayExcept {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(Product(nums)));
    }

    public static int[] Product(int[] nums) {
        int [] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i!=j) {
                    product = product*nums[j];

                }
                result[i]= product;
            }
        }
        return result;
    }
}