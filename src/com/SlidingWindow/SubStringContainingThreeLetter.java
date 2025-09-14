package com.SlidingWindow;

public class SubStringContainingThreeLetter {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(countString(s));
    }
    public static int countString(String s){
        int count=0;
        // to generate all the substrings we have find out start and end
        for(int start =0; start<s.length(); start++){
            int a=0,b=0,c=0;
            for(int end = start; end<s.length(); end++){
                if(s.charAt(end)=='a') a++;
                if(s.charAt(end)=='b') b++;
                if(s.charAt(end)=='c') c++;
                // If this substring contains at least one 'a', 'b', and 'c', count it
                if(a>0 & b>0 & c>0){
                    count++;
                }
            }
        }
        return count;

    }
}
