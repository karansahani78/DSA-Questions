package com.Heap_PriorityQueue;

public class HeapImpl {
    static class Heap {
        int[] arr;
        int size;
        int capacity;

        public Heap(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.size = 0;
        }

        // get the parent index
        public int getParent(int index){
            return (index - 1) / 2;
        }

        // get the left child index
        public int getLeftChild(int index){
            return 2 * index + 1;
        }

        // get the right child index
        public int getRightChild(int index){
            return 2 * index + 2;
        }

        // swap elements
        public void swap(int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // INSERT AN ELEMENT IN HEAP
        public void insert(int value){
            if(size == capacity){
                System.out.println("Heap is full");
                return;
            }

            // Step 1: place value at the end
            arr[size] = value;
            int childIndex = size;
            size++; // increment size immediately

            // Step 2: Heapify Up
            while(childIndex != 0){
                int parentIndex = getParent(childIndex);
                if(arr[parentIndex] < arr[childIndex]){
                    swap(parentIndex, childIndex);
                    childIndex = parentIndex; // move up
                } else {
                    break; // heap property satisfied
                }
            }
        }

        // print the heap (level-order)
        public void printHeap(){
            System.out.print("Heap Array: ");
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap(20);
        int[] nodes = {1, 2, 3, 4, 5};

        for (int val : nodes) {
            System.out.println("\nInserting: " + val);
            heap.insert(val);
            heap.printHeap();
        }
    }
}
