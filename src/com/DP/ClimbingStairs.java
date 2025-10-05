package com.DP;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairsMemo(3));
    }
    // TABULATION
    public static int climbStairs(int n){
        if(n<=2){
            return n;
        }
       int [] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    // TC = O(n)
    // SC = O(n)
    // do it using Memoization;
    public static int climbStairsMemo(int n){
        if(n<=2){
            return 2;
        }
        int dp[]= new int[n+1];

        // remember the result
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]= climbStairsMemo(dp[n-1])+climbStairsMemo(dp[n-2]);
        return dp[n];
    }
}
