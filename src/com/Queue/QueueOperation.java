package com.Queue;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // adding element to the queue using offer
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        // printing the all element after adding
        System.out.println("Queue after adding element " +queue);
        // removing element from the queue
        queue.poll();
        // after removing printing the elements first element will be removed i.e.FIFO
        System.out.println( "queue after removing the element " +queue);
        // returning the first element of the queue without removing it
        System.out.println( " First element is " +queue.peek());
        // checking if it empty or not
        System.out.println(queue.isEmpty());
        // finding out the size of the queue
        System.out.println(queue.size());

    }
}
