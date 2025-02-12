package com.Revision;

import java.util.Arrays;

public class rotateArrayByKth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Rotate this array by k=3

        // Call the rotate method
        rotate(arr, k);

        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length; // Ensure k is within array bounds

        // Step 1: Reverse the whole array
        reverse(arr, 0, arr.length - 1);
        // Step 2: Reverse from 0 to k-1
        reverse(arr, 0, k - 1);
        // Step 3: Reverse from k to arr.length-1
        reverse(arr, k, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        // Swapping to reverse the array
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
