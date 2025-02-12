package com.loops_conditions;

public class ReverseNum {
    public static void main(String[] args) {
        int n =78911;
        int ans = 0;
        while(n>0){
            int lastDigit= n%10;
            // reducing n
            n=n/10;
            ans = ans*10+lastDigit;
        }
        System.out.println(ans);
    }

}
