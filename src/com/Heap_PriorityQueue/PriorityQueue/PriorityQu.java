package com.Heap_PriorityQueue.PriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQu {
    public static class Student implements Comparable<Student>{
        private String name;
        private int marks;
        public Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }
       public String toString(){
           return "name:"+this.name+" marks:"+this.marks;
       }

        @Override
        public int compareTo( Student that) {
            return this.marks - that.marks; // sort in ascending order or increasing order and we will compare as per the marks
        }
    }
    public static void main(String[] args) {
//        PriorityQueue<Integer> minPq = new PriorityQueue<>();
//        minPq.offer(10);
//        minPq.offer(20);
//        minPq.offer(30);
//        minPq.offer(40);
//        minPq.offer(50);
//        System.out.println( "Elements in pq :" + minPq);
//        // check the min priority element
//        System.out.println("Min Priority element:"  +minPq.peek());
//        System.out.println(minPq);
//        System.out.println("After deleting the min priority element : " +minPq.poll());
//        System.out.println(minPq);
//
//// Max priorityQueue
//        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
//        maxPq.offer(10);
//        maxPq.offer(20);
//        maxPq.offer(30);
//        maxPq.offer(40);
//        maxPq.offer(50);
//        System.out.println("Elements in maxPq : " + maxPq);
//        System.out.println("Max priority element : " + maxPq.peek());
//        System.out.println(maxPq);
//        System.out.println("After deleting the max priority element : " + maxPq.poll());
//        System.out.println(maxPq);
        PriorityQueue<Student> minPq = new PriorityQueue<>();
        minPq.offer(new Student("karan", 90));
        minPq.offer(new Student("john", 80));
        minPq.offer(new Student("jackson", 70));
        minPq.offer(new Student("mili", 60));
        System.out.println(minPq.peek());

    }
}
