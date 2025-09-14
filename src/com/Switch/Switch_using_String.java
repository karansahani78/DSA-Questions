package com.Switch;

import java.util.Scanner;

public class Switch_using_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of fruits");
        String fruit = in.next();
        if(fruit.equals("Mango")){
            System.out.println("Sweet fruit");
        }
        if(fruit.equals("Apple")){
            System.out.println("A red fruit");
        }
        if(fruit.equals("Orange")){
            System.out.println("orage fruit");
        }
    }
}
