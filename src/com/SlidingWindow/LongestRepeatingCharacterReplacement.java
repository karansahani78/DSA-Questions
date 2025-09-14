package com.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s, 1)); // Expected output: 4
    }

    public static int characterReplacement(String s, int k) {
        int start = 0;
        int maxLength = 0;
        int maxFreq = 0;

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char characterAtEnd = s.charAt(end);
            freq.merge(characterAtEnd, 1, Integer::sum); // Using merge() to update frequency
            maxFreq = Math.max(maxFreq, freq.get(characterAtEnd));

            // If the number of changes needed exceeds k, shrink the window
            while ((end - start + 1) - maxFreq > k) {
                char currentStart = s.charAt(start);
                freq.merge(currentStart, -1, Integer::sum); // Decrease frequency using merge()
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
