package com.karan;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a b and c");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min=a;
        if(b<min){
            min =b;
        }
        if(c<min){
            min =c;
        }
        System.out.println(min);
    }
}
