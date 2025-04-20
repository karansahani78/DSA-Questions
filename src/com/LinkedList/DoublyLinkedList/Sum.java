package com.LinkedList.DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    private Node head;
    private Node tail;
    private int size;

    public class Node {
        private Node next;
        private Node previouse;
        private int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previouse = null;
        }
    }

    // Insert into linked list
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previouse = newNode;
            head = newNode;
        }
        size++;
    }

    // Display linked list
    public void display(){
        Node temp = head;
        System.out.print(" null  <-");
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
    }

    // Return all node pairs whose sum equals target
    public static List<Node[]> sum(int target, Node head){
        List<Node[]> result = new ArrayList<>();
        if(head == null) return result;

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        Node start = head;
        Node end = tail;

        while(start != null && end != null && start != end && end.next != start){
            int currentSum = start.data + end.data;
            if(currentSum == target){
                result.add(new Node[]{start, end});
                start = start.next;
                end = end.previouse;
            } else if(currentSum < target){
                start = start.next;
            } else {
                end = end.previouse;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Sum list = new Sum();
        list.insertAtFirst(9);
        list.insertAtFirst(8);
        list.insertAtFirst(6);
        list.insertAtFirst(5);
        list.insertAtFirst(4);
        list.insertAtFirst(2);
        list.insertAtFirst(1);

        list.display();

        List<Node[]> results = sum(7, list.head);
        if (results.isEmpty()) {
            System.out.println("No pairs with sum 7 found.");
        } else {
            results.forEach(pair -> System.out.println(pair[0].data + " " + pair[1].data));
        }
    }
}
