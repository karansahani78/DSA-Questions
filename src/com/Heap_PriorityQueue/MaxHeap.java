package com.Heap_PriorityQueue;

public class MaxHeap {
    static class Heap {
        int[] heapArr;
        int size;
        int capacity;

        public Heap(int capacity) {
            this.capacity = capacity;
            this.heapArr = new int[capacity];
            this.size = 0;
        }

        // insert element in heap
        public void insert(int value) {
            if (size == capacity) {
                System.out.println("Heap is full");
                return;
            }
            heapArr[size] = value;
            int childIndex = size; // it the free space where you can add the element
            size++;
            while (childIndex != 0 && heapArr[childIndex] > heapArr[getParent(childIndex)]) {
                swap(childIndex, getParent(childIndex));
                childIndex = getParent(childIndex);
            }

        }
        // remove and return the maximum
        public int getMaxAndRemove() {
            if(size==0){
                throw new IllegalStateException("Heap is empty");
            }
            // now store the root or max
            int maxValue = heapArr[0];
            // move last element to the root
            heapArr[0]=heapArr[size-1];
            size--;
            heapifyDown(0); // restore the maxHeap property
            return maxValue;
        }
        public void heapifyDown(int index) {
            int current =index;
            while(true){
                int leftChildIndex = getLeftChild(current);
                int rightChildIndex = getRightChild(current);
                int largestChildIndex = current;
                if(leftChildIndex<size && heapArr[leftChildIndex]>heapArr[largestChildIndex]){
                    largestChildIndex = leftChildIndex;
                }
                if(rightChildIndex<size && heapArr[rightChildIndex]>heapArr[largestChildIndex]){
                    largestChildIndex = rightChildIndex;
                }
                if(largestChildIndex==current){
                    break;
                }
                swap(current,largestChildIndex);
                current = largestChildIndex;
            }
        }

        // get parent
        public int getParent(int index) {
            return (index - 1) / 2;
        }

        // get leftChild
        public int getLeftChild(int index) {
            return 2 * index + 1;
        }

        // get rightChild
        public int getRightChild(int index) {
            return 2 * index + 2;
        }

        // swap the elements i.e., parent and child to follow max heap property
        public void swap(int i, int j) {
            int temp = heapArr[i];
            heapArr[i] = heapArr[j];
            heapArr[j] = temp;
        }
        // suppose i want maximum value
        public int getMax() {
            if(size==0){
                throw new IllegalStateException("Heap is empty");
            }
            return heapArr[0];
        }

    }

    public static void main(String[] args) {
        Heap heap = new Heap(10); // capacity = 10
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);

        // print to verify
        for (int i = 0; i < heap.size; i++) {
            System.out.print(heap.heapArr[i] + " ");
        }
        System.out.println();
        System.out.println(heap.getMax());
        heap.getMaxAndRemove();
        for (int i = 0; i < heap.size; i++) {
            System.out.print(heap.heapArr[i] + " ");
        }
        System.out.println();
    }
}
