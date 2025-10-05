package com.DP;
// TOP-DOWN

public class Memoization {
    public static void main(String[] args) {
        System.out.println(fib(5));

    }
    public static int fib(int n){
        int [] dp = new int[n+1];
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        // store the result in dp
        dp[n] = fib(n-1) + fib(n-2);
        return dp[n];
    }
}
//TC: O(n)
//SC: O(n)