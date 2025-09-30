package com.Heap_PriorityQueue;

public class MaxH {
    // Inner class representing the Max Heap
    static class MHeap {
        int[] arr;
        int size;
        int capacity;

        // Constructor
        public MHeap(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.size = 0;
        }

        // Get parent index
        public int getParent(int index) {
            return (index - 1) / 2;
        }

        // Get left child index
        public int getLeftChild(int index) {
            return 2 * index + 1;
        }

        // Get right child index
        public int getRightChild(int index) {
            return 2 * index + 2;
        }

        // Swap elements
        public void swap(int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Insert element
        public void insert(int value) {
            if (size == capacity) {
                System.out.println("Heap is full");
                return;
            }

            // Step 1: Insert at end
            arr[size] = value;
            int currentIndex = size;
            size++;

            // Step 2: Heapify up
            while (currentIndex != 0) {
                int parentIndex = getParent(currentIndex);
                if (arr[currentIndex] > arr[parentIndex]) {
                    swap(currentIndex, parentIndex);
                    currentIndex = parentIndex;
                } else {
                    break;
                }
            }
        }
        // Get max element
        public int getMax(){
            if(size==0){
                throw new RuntimeException("Heap is empty");
            }
            return arr[0];
        }

        // Print heap array
        public void printHeap() {
            System.out.print("Heap Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        // DELETE ELEMENT i.e. root
        public int removeMax(){
            if(size==0){
                throw new RuntimeException("Heap is empty");
            }
            int max = arr[0];
            arr[0] = arr[size-1];
            size--;
            int currentIndex =0;
            // heapify down to make it follow heap property
            while(true){
                int leftChild = getLeftChild(currentIndex);
                int rightChild = getRightChild(currentIndex);
                int largest = currentIndex;
                if(leftChild<size && arr[leftChild] > arr[largest]){
                    largest = leftChild;
                }
                if(rightChild<size && arr[rightChild] > arr[largest]){
                    largest = rightChild;
                }
                if(largest!=currentIndex){
                    swap(currentIndex, largest);
                    currentIndex = largest;
                }else{
                    break;
                }

            }
            return max;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a heap with capacity 10
        MHeap heap = new MHeap(10);

        int[] values = {1, 2, 3, 4, 5, 6};

        // Insert elements into heap
        for (int val : values) {
            System.out.println("\nInserting: " + val);
            heap.insert(val);
            heap.printHeap();
            System.out.println("Max element: " + heap.getMax());

        }

        // Delete max elements one by one
        System.out.println("\nRemoving max elements:");
        while (heap.size > 0) {
            int max = heap.removeMax();
            System.out.println("Removed max: " + max);
            heap.printHeap();
        }
    }

    }
