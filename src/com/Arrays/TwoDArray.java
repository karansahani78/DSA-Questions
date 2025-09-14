package com.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // now for taking rows input
        for (int row = 0; row < arr.length; row++) {
            // for taking column input
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
            // now printing the output
//        for(int row=0; row< arr.length; row++){
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
            // you can also print it like this row is array itself so that
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}