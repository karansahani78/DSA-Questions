package com.LinkedList;

public class SinglyLinkedListAddingAtFirst {
    // fields of linkedList or what are the fields a Node always have
    private Node head;
    private Node tail;
    private int size;
    // constructor to initialize the Node
    public SinglyLinkedListAddingAtFirst(){
        this.size =0;
    }
    // inner class to define a Node  and giving the fields of the node
    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    // creating a method to insert the value atfirst of the linkedlist
    public void InsertAtFirst(int val){
        // to insert value we have to create a node first
        Node node = new Node(val);
        node.next = head;  // linking the node
        head =node; // updating the node
        if(tail==null){
            tail = head;
        }
        size++;
    }
    // creating a function to display the linkedlist
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value  +  " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        SinglyLinkedListAddingAtFirst list = new SinglyLinkedListAddingAtFirst();
        list.InsertAtFirst(10);
        list.InsertAtFirst(20);
        list.InsertAtFirst(30);
        list.Display();  // Expected Output: 30 -> 20 -> 10 -> null
    }
}