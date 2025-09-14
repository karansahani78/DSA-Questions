package com.String;

import java.util.HashSet;

public class Leetcode3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));

    }
    public static int longestSubstring(String s) {
        if(s.isEmpty() || s==null){
            return 0;
        }
        int start =0;
        int end =0;
        int maxLength=Integer.MIN_VALUE;
        HashSet<Character> seen = new HashSet<>();
        for(end=0; end<s.length(); end++){
            char currentCharacter = s.charAt(end);
            while(seen.contains(currentCharacter)){
                seen.remove(s.charAt(start));
                start++; // shrink the window now
            }
            seen.add(currentCharacter);
            int currentWindowLength = end-start+1;
            maxLength = Math.max(maxLength,currentWindowLength);
            if(currentWindowLength>maxLength){
                maxLength = currentWindowLength;
            }

        }
        return maxLength;
    }
}
