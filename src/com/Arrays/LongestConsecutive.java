package com.Arrays;

import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 1};
        System.out.println(Cons(nums)); // Use the Cons method and print the result
    }

    public static int Cons(int[] nums) {
        int currentConse = 0; // int store current conse of 1
        int maxConse = 0; // it store max i.e maximum time 1 appear
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) { // Increment current streak if the element is 1
                currentConse++;
            } else { // Reset streak when encountering 0
                currentConse = 0;
            }

            if (currentConse > maxConse) { // Update max streak if needed
                maxConse = currentConse;
            }
        }
        return maxConse;
    }
}
