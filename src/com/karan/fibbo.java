package com.karan;

import java.util.Scanner;

public class fibbo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // nth fibo
        System.out.println("Enter the value of n");
        int n =in.nextInt();
        int a=0;
        int b =1;
        int count=2;
        while(count<=n){
            int temp=b;
            b= a+b;
            a =temp;
            count++;
        }
        System.out.println(b);

    }
}
