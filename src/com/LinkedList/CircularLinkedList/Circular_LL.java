package com.LinkedList.CircularLinkedList;

public class Circular_LL {
    private Node head;
    private Node tail;
    private int size;
    public class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // inserting node at first
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            tail.next = head; // circular linked
        } else{
            newNode.next = head;
            tail.next = newNode;
            head= newNode;
        }
        size++;
    }
    // dispaly
    public void display(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        while(temp!=head);
            System.out.println("HEAD"); // Stop when back to head
        }
        // or you can do it like this
//        public void display() {
//            if (head == null) {
//                System.out.println("List is empty");
//                return;
//            }
//
//            Node temp = head;
//            while (true) {
//                System.out.print(temp.data + " -> ");
//                temp = temp.next;
//                if (temp == head) { // Stop when back to head
//                    break;
//                }
//            }
//            System.out.println("HEAD");
//        }


    public static void main(String[] args) {
        Circular_LL list = new Circular_LL();
        list.insertAtFirst(10);
        list.insertAtFirst(11);
        list.insertAtFirst(12);
        list.insertAtFirst(13);
        list.display();
    }
    }
