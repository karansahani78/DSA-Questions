package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        // Array of Object
        String[] str = new String[size];
        // to take input
        for (int i = 0; i < size; i++) {
            str[i] = in.next();
        }
        // for output
        //System.out.println(Arrays.toString(str));
        for (int i = 0; i < size; i++) {
            System.out.print(str[i] + " ");

            // modify or update index
            str[1]="karna";
            str[0]="saurav";
        }
    }
}