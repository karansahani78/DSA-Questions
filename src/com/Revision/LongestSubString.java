package com.Revision;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        // bruteforce approach time complexity O(n^2) and space complexity O(min(n,m))
        // m is the size of the character set (for ASCII, typically constant at 256)
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
       /*initialize max length
        then generate all the substring
        create hashset to check duplicacy
        then get the current character and check it by adding to the hashset if failed the we found duplicate then break
        then get current length end - start+1
                */
        int maxLength =Integer.MIN_VALUE;
        for(int start =0; start<s.length(); start++){
            HashSet<Character>seen = new HashSet<>();
            for(int end =start; end<s.length(); end++){
                char currentCharacter = s.charAt(end);
                if(!seen.add(currentCharacter)){
                    break;
                }
                int currentLength = end-start+1;
                if(currentLength>maxLength){
                    maxLength= currentLength;
                }


            }
        }

        return maxLength;
    }
}
