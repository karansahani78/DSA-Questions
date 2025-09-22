package com.Heap_PriorityQueue.PriorityQueue;

import java.util.PriorityQueue;

public class Leetcode215 {
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));

    }
    public static int findKthLargest(int[] nums, int k) {
        // lets user min heap for
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.poll(); // if the size is greater than k then we remove the smallest element
            }
        }
        return pq.peek(); // now as a min heap we will get the smallest element
    }
}
