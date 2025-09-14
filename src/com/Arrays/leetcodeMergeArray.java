package com.Arrays;

import java.util.Arrays;

public class leetcodeMergeArray {
    public static void main(String[] args) {
        int[] nums1 = new int[10]; // nums1 with enough capacity to hold nums2 elements
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 4;
        nums1[4] = 5;

        int[] nums2 = {6, 7, 8, 9, 10};

        // Merge nums2 into nums1
        for (int i = 0; i < nums2.length; i++) {
            nums1[5 + i] = nums2[i]; // Start placing nums2 from index 5 in nums1
        }

        System.out.println(Arrays.toString(nums1));
    }
}
