package com.LinkedList.DoublyLinkedList;

import java.util.ArrayList;

public class Pairs {
    private Node head;
    private Node tail;
    private int size;

    public static class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        System.out.print("null <- ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
    }

    // Getter for head to allow access in static method
    public Node getHead() {
        return head;
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (head == null) return result;

        // Find the tail
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node start = head;
        Node end = tail;

        while (start != null && end != null && start != end && end.next != start) {
            int sum = start.data + end.data;
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(start.data);
                pair.add(end.data);
                result.add(pair);
                start = start.next;
                end = end.prev;
            } else if (sum < target) {
                // Move end to the previous node to increase the sum
                end = end.prev;
            } else {
                // Move start to the next node to decrease the sum
                start = start.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Pairs list = new Pairs();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);

        list.display();  // Output: null <- 5 <-> 4 <-> 3 <-> 2 <-> 1 -> null

        findPairsWithGivenSum(7, list.head).forEach(pair -> System.out.println(pair.get(0) + " + " + pair.get(1)));

        }
    }
