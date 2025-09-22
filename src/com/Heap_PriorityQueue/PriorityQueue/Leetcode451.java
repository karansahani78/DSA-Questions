package com.Heap_PriorityQueue.PriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Leetcode451 {
     static class MyChar implements Comparable<MyChar>{
         char character;
         int frequency;
         public MyChar(char character, int frequency){
             this.character=character;
             this.frequency=frequency;
         }
         @Override
         public int compareTo(@NotNull MyChar that) {
             return that.frequency-this.frequency; // sort in descending order
         }
     }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<MyChar> pq = new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        // now i will put the character with its frequency in the priority  priority queue from Map
        for (char ch : map.keySet()) {
            pq.offer(new MyChar(ch, map.get(ch)));
        }
        // now remove the character from the priority queue and add it to the result string
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            MyChar top = pq.poll();
            for (int i = 0; i < top.frequency; i++) {  // append frequency times
                result.append(top.character);
            }
        }
        return result.toString();
    }
        public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
