package com.Switch;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of fruit(Mango,Apple,Banana):");
        String fruit = in.nextLine().trim().toLowerCase();
        //Syntax
        // switch(expression){
        // case "one";
        // do something
        // break;
        // switch "two";
        // do something
        // break
        switch (fruit){
            case "mango":
                System.out.println("A sweet fruit");
                break;

            case "apple":
                System.out.println("A red fruit");
                break;

            case "banana":
                System.out.println("Yellow fruit");
                break;

            default:
                System.out.println("Invalide fruit name");
        }

    }
}
