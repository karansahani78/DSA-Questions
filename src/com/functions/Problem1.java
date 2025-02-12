package com.functions;

import java.util.Scanner;

// take two number as input and print sum of them
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a,b));

    }
    // creating a method for input
    public static int sum(int a, int b){
        return a+b;
    }
}
