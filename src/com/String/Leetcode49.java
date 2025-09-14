package com.String;

import java.util.*;

public class Leetcode49 {
    /*
    Given an array of strings strs, group the anagrams together.
    You can return the answer in any order.
    */

    public static void main(String[] args) {
        // Define the input array of strings
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Call groupAnagrams and print the result
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] s) {
        // Create a map to store sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array
        for (String currentString : s) {
            // Convert the current string into a character array
            char[] stringArray = currentString.toCharArray();

            // Sort the characters in the array
            Arrays.sort(stringArray);

            // Convert the sorted character array back into a string
            String sortedString = new String(stringArray);

            // If the sorted string is not already in the map, add it with an empty list
            map.putIfAbsent(sortedString, new ArrayList<>());

            // Add the original string to the list corresponding to the sorted key
            map.get(sortedString).add(currentString);
        }

        // Return all the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
