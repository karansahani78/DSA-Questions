package com.Arrays;

import java.util.Arrays;

public class PrintTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 5, 6, 7, 8}
        };
//        // to print out the given aray using loops
//        for(int row=0; row<arr.length; row++){
//            // for colum
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            // for next line
//            System.out.println();
//        }
        // now using toString method
        for (int[] nums : arr) {
            System.out.println(Arrays.toString(nums));

        }
    }
}