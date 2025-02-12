package com.functions;

import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println(armstrong(n));
    }
    public static boolean armstrong(int n){
        int originalNumber =n;
        int ans =0;
        while(n>0){
            int reminder = n%10;
            ans = ans+reminder*reminder*reminder;
            n=n/10;
        }
        return originalNumber==ans;
    }
}
