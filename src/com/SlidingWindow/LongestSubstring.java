package com.SlidingWindow;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        // Variable to store the length of the longest substring without repeating characters
        int maxLength = 0;
        if (s == null || s.isEmpty()) {
            return 0;  // Directly return 0 for empty string
        }

        // Outer loop starts at each character in the string
        for (int st = 0; st < s.length(); st++) {
            // HashSet to track unique characters in the current substring
            HashSet<Character> seen = new HashSet<>();

            // Inner loop to form substrings starting from index 'st'
            for (int end = st; end < s.length(); end++) {
                // Get the current character in the substring
                char currentChar = s.charAt(end);

                // If the character is already in the set (i.e., it's a duplicate), stop expanding the window
                if (!seen.add(currentChar)) {
                    break;  // Break the loop if a duplicate character is found
                }

                // Calculate the current length of the substring
                int currentLength = end - st + 1;

                // Update maxLength if the current length is greater than the previous maxLength
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
        }

        // Return the maximum length of the longest substring without repeating characters
        return maxLength;
    }
}