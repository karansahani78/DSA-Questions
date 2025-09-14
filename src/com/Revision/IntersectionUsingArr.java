package com.Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionUsingArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 4};
        IntersectionUsingArr intersectionUsingArr = new IntersectionUsingArr();
        System.out.println(Arrays.toString(intersectionUsingArr.intersect(arr1, arr2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                    nums2[j] = -1; // Avoid counting same element again
                    break;
                }
            }
        }
        // Convert ArrayList to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
