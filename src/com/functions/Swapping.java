package com.functions;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(Swap(a, b));
    }

    // method for swapping
    public static String Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return "a = " + a + ", b = " + b; // Return the swapped values as a string
    }
}
