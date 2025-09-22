package com.Heap_PriorityQueue.PriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Leetcode347Pr {
    static  class Number implements Comparable<Number>{
        int element;
        int frequency;
        public Number(int element, int frequency){
            this.element=element;
            this.frequency=frequency;
        }
        // override the compareTo method
        @Override
        public int compareTo(@NotNull Number that) {
            return that.frequency-this.frequency; // sort in descending order
        }

    }
    public static void main(String[] args) {
        int [] nums = {1,3,1,3,5,6};
        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }
    public static int [] topKFrequent(int[] nums, int k) {
        // count the frequency of each element
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Number> pq = new PriorityQueue<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
      // insert the elements into the priority queue with their frequencies
        for(int key :map.keySet()){
            pq.offer(new Number(key,map.get(key)));
        }
        int [] result = new int[k];
        for(int i=0; i<k; i++){
            result[i]=pq.poll().element;
        }
        return result;
    }
}
