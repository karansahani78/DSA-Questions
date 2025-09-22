package com.Heap_PriorityQueue.PriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Leetcode692 {

    // Custom Word class that stores word + frequency
    // Implements Comparable so it can be ordered inside PriorityQueue
    static class Word implements Comparable<Word> {
        String word;
        int frequency;

        public Word(String word, int frequency) {
            this.word = word;          // store the word itself
            this.frequency = frequency; // store its frequency count
        }

        @Override
        public int compareTo(@NotNull Word that) {
            // First, compare by frequency (higher frequency first)
            if (this.frequency != that.frequency) {
                return that.frequency - this.frequency;
                // "that - this" ensures descending order by frequency
            }
            // If frequency is the same → compare alphabetically (ascending)
            return this.word.compareTo(that.word);
        }
    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        // Call function and print top 2 frequent words
        System.out.println(topKFrequent(words, 2));
    }

    // Function to return top K frequent words
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>(); // Result list

        // Step 1: Count frequency of each word
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Step 2: Add words with frequency into PriorityQueue
        // PriorityQueue will sort them based on Word.compareTo()
        PriorityQueue<Word> pq = new PriorityQueue<>();
        for (String word : freq.keySet()) {
            pq.offer(new Word(word, freq.get(word)));
        }

        // Step 3: Poll top K elements from PQ and add to result
        for (int i = 0; i < k; i++) {
            list.add(pq.poll().word);
        }

        // Step 4: Return result list
        return list;
    }
}
