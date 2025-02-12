package com.Arrays;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // arrays of primitive
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size= in.nextInt();
        int[]arr = new int[size];
        // for taking input
        for(int i=0; i<size; i++){
            arr[i]=in.nextInt();
        }
        // to print output
        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
            // modify or update
            arr[0]=1;
            arr[1]=2;
        }
    }
}
