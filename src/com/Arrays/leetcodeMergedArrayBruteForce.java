package com.Arrays;

import java.util.Arrays;

public class leetcodeMergedArrayBruteForce {
    public static void main(String[] args) {
        // Merge two Array
        // it is brute force approach
        int[] nums1 ={1,2,3,4,5};
        int[] nums2 ={6,7,8,9,10};
        System.out.println(Arrays.toString(Merge(nums1,nums2)));

    }
    public static int[] Merge(int[] nums1, int[] nums2){
        int[] newArray = new int[nums1.length+nums2.length];
        // copy nums1 to newArray
        for(int i=0; i<nums1.length; i++){
            newArray[i] = nums1[i];
        }
        // copy nums2 to newArray
        for(int i=0; i<nums2.length; i++){
            // The elements of nums1 occupy the first nums1.length positions in the newArray then nums2 element occupy
            newArray[nums1.length+i]= nums2[i];
        }
        return newArray;

    }
}
