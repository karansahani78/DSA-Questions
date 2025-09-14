package com.LinkedList.SingularLinkedList;

public class SinglyLinkedListAddAtEnd {
    // fields of Node
    private Node head;
    private Node tail;
    private int size;
    // constructor to initialize the size of the node
    public SinglyLinkedListAddAtEnd(){
        this.size =0;
    }
    // inner class to create or define node
    public class Node{
        public Node(int value) {
            this.value = value;
        }
        // node has some properties
        private int value;
        private Node next;
    }

    // function to add element at last position of linkedlist
    public void InsertAtEnd(int val){
        Node node = new Node(val);
        if (head == null) {   // if linkedlist is empty
            head = node;
            tail = node;
        } else {
            tail.next = node;  // link current tail to new node
            tail = node;       // update tail to new node
        }
        size++;
    }
    // remove first
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    // method to display the linkedlist
    public void Display(){
        Node temp = head; // creating a temporary node to hold the value of head so that it cal run again and again
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        SinglyLinkedListAddAtEnd list = new SinglyLinkedListAddAtEnd();
        list.InsertAtEnd(10);
        list.InsertAtEnd(11);
        list.InsertAtEnd(12);
        list.InsertAtEnd(13);
        list.Display();
        System.out.println(list.deleteFirst());

    }
}
