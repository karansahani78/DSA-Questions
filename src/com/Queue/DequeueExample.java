package com.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeueExample {
    public static void main(String[] args) {
        Queue<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offer(11);
        deque.offer(12);
        deque.offer(13);
        deque.add(14);
        System.out.println( "queue after adding elements " +deque);
        // poll ,after removing element
        deque.poll();
        System.out.println("after removing firest element "+ deque);
        // getting first element from the queue
        System.out.println( "the first element of queue "+deque.peek());

    }
}
