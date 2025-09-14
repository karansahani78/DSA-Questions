package com.loops_conditions;


public class countNums {
    public static void main(String[] args) {
        int n = 1234555;
        int count = 0;
        // checking how many times 5 occured
        while (n > 0) {
            int reminder = n % 10; // extracting last digit from n
            if (reminder == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
