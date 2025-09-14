package com.String;

public class isPalindrom {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();

        // Initialize indices
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            // Skip non-alphanumeric characters
            while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            }

            // Compare characters at both ends
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
