package com.loops_conditions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            // take operators as input
            System.out.println("Enter operator");
            char operator = in.next().charAt(0);
            System.out.println();

            if (operator == 'x' || operator == 'X') {
                // Exit condition
                System.out.println("Invalid operators !!");
                break;
            }

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                // input two numbers
                System.out.println("Enter two numbers");
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
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                }
                if (operator == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed.");
                        continue;
                    }
                }
                System.out.println(ans);
            } else {
                System.out.println("Invalid operator!!");
            }
        }
    }
}
