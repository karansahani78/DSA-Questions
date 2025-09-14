package com.karan;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int count=0;
        while(n>0){
            // here i am finding the ocurrence of 5
            int reminder = n%10;
            if(reminder==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
