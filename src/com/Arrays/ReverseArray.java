package com.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Reverse(nums); // Indices to reverse the entire array
        System.out.println(Arrays.toString(nums));
    }

    public static void Reverse(int[] nums) {

        int start = 0;
        int end = nums.length-1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
