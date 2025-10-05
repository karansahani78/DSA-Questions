package com.DP;
// OPTIMIZE DP
public class Fibo {
    public static void main(String[] args) {
        System.out.println(fib(5));

    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        int prev1 =0;
        int prev2 =1;
        int ans =0;
        for(int i=2; i<=n; i++){
            ans = prev1 +prev2;
            prev1=prev2;
            prev2=ans;
        }
        return ans;
    }
}
//TC: O(n)
//SC: O(1)
