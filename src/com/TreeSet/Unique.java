package com.TreeSet;

import java.util.TreeSet;

public class Unique {
    public static void main(String[] args) {
        int[] nums = {1,2, 2, 3, 3, 4, 4, 5};
        System.out.println(Uni(nums));
    }

    public static int Uni(int[] nums) {
        TreeSet<Integer> unique = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            unique.add(nums[i]); // Add all numbers to the set
        }

        // Return the smallest unique element from the set
        if (!unique.isEmpty()) {
            return unique.first();
        }

        return -1; // Return -1 if the set is empty
    }
}
