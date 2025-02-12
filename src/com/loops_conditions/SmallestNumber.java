package com.loops_conditions;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = in.nextInt();
        System.out.println("Enter the value of b");
        int b = in.nextInt();
        System.out.println("Enter the value of c");
        int c = in.nextInt();

        int min = a;
        if(b<min){
            min =b;
        } if(c<min){
            min =c;
        }
        System.out.println("The smallest number is " + min);
    }
}
