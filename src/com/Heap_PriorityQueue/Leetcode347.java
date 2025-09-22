package com.Heap_PriorityQueue;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode347 {
    public static void main(String[] args) {
        int[] inputNumbers = {1, 3, 1, -3, 5, 3, 6, 6, 6, 3, 7};
        System.out.println(Arrays.toString(findTopKFrequent(inputNumbers, 2)));
    }

    public static int[] findTopKFrequent(int[] numbers, int k) {
        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Step 2: Prepare result array
        int[] topKNumbers = new int[k];

        // Step 3: Find the top k frequent numbers
        for (int i = 0; i < topKNumbers.length; i++) {
            int highestFrequency = -1;
            int mostFrequentNumber = -1;

            // Find the number with the maximum frequency
            for (int key : frequencyMap.keySet()) {
                if (frequencyMap.get(key) > highestFrequency) {
                    highestFrequency = frequencyMap.get(key);
                    mostFrequentNumber = key;
                }
            }

            // Store the most frequent number in result
            topKNumbers[i] = mostFrequentNumber;

            // Remove it from the map so next max can be found
            frequencyMap.remove(mostFrequentNumber);
        }

        return topKNumbers;
    }
}
