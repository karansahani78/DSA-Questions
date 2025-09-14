package com.functions;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        Long n = in.nextLong();
        long a = 0;
        long b = 1;
        for(long i=2; i<=n; i++){
            long temp=b;
            b =b+a;
            a=temp;
        }
        System.out.println(b);
    }

}
