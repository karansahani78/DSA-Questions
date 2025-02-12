package com.loops_conditions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = in.nextInt();
        System.out.println("Enter the value of b");
        int b = in.nextInt();
        System.out.println("Enter the value of c");
        int c = in.nextInt();

        int  max = a;
        if(b>max){
            max =b;
        } if(c>max){
            max =c;
        }
        System.out.println("The max number is " +max);
    }
}
