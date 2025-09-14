package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the size of the list:");
        int size = in.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter " + size + " numbers:");
        // for input
        for(int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        
        System.out.println("The numbers you entered are:");
        // for output
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); // Add a newline at the end
        
        in.close(); // Close the scanner
    }
}
