package com.functions;

import java.util.Locale;
import java.util.Scanner;

public class String_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message of greeting");
        String greeting = in.nextLine().trim().toLowerCase();
        System.out.println(hi(greeting));
    }
    // creating a String function
    public static String hi(String greeting){
        return greeting;
    }
}
