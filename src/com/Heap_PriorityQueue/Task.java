package com.Heap_PriorityQueue;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Task {
    static   class Number implements Comparable<Number>{
        int element;
        int frequency;
        public Number(int element, int frequency){
            this.element=element;
            this.frequency=frequency;
        }
        @Override
        public int compareTo(Number that){
            return that.frequency-this.frequency; // sorted in decreasing order
        }
    }
    // task find the most k frequent elements in an array and return it
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,6,5}; // output :[5,6]
        System.out.println(Arrays.toString(frequent(nums,2)));
    }
    public static int[] frequent(int [] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
            /* 1->1 , 2->1, 3->1, 4->1, 5->2, 6->
             */
        }
        PriorityQueue<Number> pq = new PriorityQueue<>();
        for(int key:map.keySet()){
            pq.offer(new Number(key, map.get(key)));

        }
        int [] result = new int[k];
        for(int i=0; i<k; i++){
            result[i]=pq.poll().element;

        }
        return result;
    }
}
