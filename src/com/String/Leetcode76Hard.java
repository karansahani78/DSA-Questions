package com.String;

public class Leetcode76Hard {
//    Given two strings s and t of lengths m and n respectively,
//    return the minimum window substring of s such that every character in
//    t (including duplicates) is included in the window. If there is no such substring,
//    return the empty string "".
//    The testcases will be generated such that the answer is unique.

//    Example 1:
//    Input: s = "ADOBECODEBANC", t = "ABC"
//    Output: "BANC"
//    Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

//    Example 2:
//    Input: s = "a", t = "a"
//    Output: "a"
//    Explanation: The entire string s is the minimum window.

//    Example 3:
//    Input: s = "a", t = "aa"
//    Output: ""
//    Explanation: Both 'a's from t must be included in the window.
//    Since the largest window of s only has one 'a', return empty string.

    public static void main(String[] args) {


        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s,t));

    }
    public static String minWindow(String s, String t) {

        int n = s.length(), m = t.length();
        int mingLength = Integer.MAX_VALUE;
        String result = "";
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                String sS = s.substring(start, end);
                if (isAnagram(sS, t)) {
                    if (mingLength> sS.length()) {
                        mingLength = sS.length();
                        result = sS;
                    }
                }

            }
        }
        return result;
    }
    // helper method to check anagram
    public static boolean isAnagram(String s1, String s2){
        if (s1.length() < s2.length()) return false;
        int [] freq = new int[256];
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i)]++;
        }
        for(int i = 0; i < s2.length(); i++){
            freq[s2.charAt(i)]--;
        }
        for(int i=0; i<256; i++){
            if(freq[i] < 0) return false;
        }
        return true;
    }
}
