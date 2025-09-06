package com.String;

public class Leetcode5 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));


    }
    public static String longestPalindrome(String s) {
        if(s==null || s.isEmpty()) return "";
        /*
        generate all the substring
         */
        String longestPalindrome ="";
        int longestLength=Integer.MIN_VALUE;
        int start=0;
        int end =s.length()-1;
        for(start =0; start<s.length(); start++){
            for(end =start; end<=s.length(); end++){
                String substrings = s.substring(start,end);

                // now check if this substring is palindrome or not
                if(isPalindrome(substrings) && substrings.length()>longestLength){
                    longestPalindrome = substrings;
                    longestLength = longestPalindrome.length();
                }
            }
        }
        return longestPalindrome;
    }

    // helper method to check if a character is a palindrome or not
    public static boolean isPalindrome(String str){
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
