package com.karan;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a b and c");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            // suppose a is maximum
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            System.out.println(max);
        }

    }
