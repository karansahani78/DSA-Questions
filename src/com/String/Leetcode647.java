package com.String;

public class Leetcode647 {
    // Palindromic substrings
    public static void main(String[] args){
        String s = "abc";
        System.out.print(countSubstrings(s));

    }
    // count palindromic strings
    public static int countSubstrings(String s){
        int start =0;
        int end =0;
        int substringCount =0;
        for(start=0; start<s.length(); start++){
            for(end = start+1; end<=s.length(); end++){
                String substring = s.substring(start,end);

                if(isPalindrome(substring)){
                    substringCount++;
                }
            }

        }
        return substringCount;

    }
    // helper method to check if palindrom or not
    public static boolean isPalindrome(String s){
        int left =0;
        int right =s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
