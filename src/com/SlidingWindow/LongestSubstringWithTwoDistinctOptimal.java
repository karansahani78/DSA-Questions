package com.SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithTwoDistinctOptimal {
    public static void main(String[] args) {
        String s = "ninninja";
        System.out.println(lengthOfLongestSubstringBruteForce(s,2));
    }
    // still failing the test cases
    public static int lengthOfLongestSubstringBruteForce(String s, int k) {
        int LongestSubstring =0;
        int start =0;
        HashSet<Character> distinct = new HashSet<>();
        for(int end = start; end<s.length(); end++){
            char currentCharacter = s.charAt(end);
            distinct.add(currentCharacter);
            if(distinct.size()>k){
                distinct.remove(s.charAt(start));
                start++;

            }
            LongestSubstring = Math.max(LongestSubstring,end-start+1);
        }
        return LongestSubstring;
    }
    }

