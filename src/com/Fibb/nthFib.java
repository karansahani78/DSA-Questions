package com.Fibb;

public class nthFib {
    public static void main(String[] args) {
        System.out.println(fibo(7));

    }
    public static int fibo(int n){
        // base conditon
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
