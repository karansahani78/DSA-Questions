package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {5, 4, 4, 1, 2, 3, 3, 4, 6, 9, 5, 9,6};
        int[] result = duplicate(nums);

        // Correctly print the resulting array of duplicates
        System.out.println(Arrays.toString(result));
    }

    public static int[] duplicate(int[] nums) {
        // Make a HashSet to store unique elements
        HashSet<Integer> unique = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Check if the number is already in the set
            if (unique.contains(nums[i])) {
                // Add to result if not already present
                result.add(nums[i]);
                unique.remove(nums[i]);
            } else {
                unique.add(nums[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
