package com.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueuFun {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        for(int i = 0; i<10; i++){
            queue.add(i);
            System.out.println(queue);

        }
    }
}
