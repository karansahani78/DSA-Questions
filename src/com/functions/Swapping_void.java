package com.functions;

public class Swapping_void {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Swap(a,b);
    }
    // creating method for swapping
    public static void Swap(int a, int b){
        int temp=a;
        a =b;
        b=temp;
        System.out.println(a + " "+b);
    }
}