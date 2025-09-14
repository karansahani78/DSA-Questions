package com.karan;

import java.util.Scanner;

public class CalCu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        // for continuouse execution of our program
        while (true) {
            // taking operators as input
            System.out.println("Enter the operator");
            char operator = in.next().charAt(0);
            // Termination condition of our code
            if (operator == 'x' || operator == 'X') {
                System.out.println("Invalid operator!!");
                break;
            }
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                // taking two numbers as input
                System.out.println("Enter the two numbers num1 and num2");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (operator == '+') {
                    ans = num1 + num2;
                }
                if (operator == '-') {
                    ans = num1 - num2;
                }
                if (operator == '*') {
                    ans = num1 * num2;
                }
                if (operator == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Numbers can not divisible by 0");
                    }
                }
                if (operator == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Modulo by zero is not allowed");
                    }
                }
                System.out.println(ans);


            }
        }
    }
}
