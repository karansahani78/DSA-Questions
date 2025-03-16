package com.LinkedList.DoublyLinkedList;

public class Doubly_LLL {
    private Node head;
    private Node tail;
    private int size;

    public class Node{
        private int data;
        private Node next;
        private Node previouse;
        public Node(int data){
            this.data = data;
            this.next =null;
            this.previouse=null;
        }
    }
    // now inserting a node at first
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null || tail==null){
            head=tail=newNode;
        } else{
            newNode.next = head;
            newNode.previouse = null;
            if(head!=null){
                head.previouse = newNode;
            }
            head = newNode;

        }
        size++;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("printing in reverse ");
        while(last!=null){
            System.out.print(last.data + " -> ");
            last = last.previouse;
        }
        System.out.println("START");
    }

    // inserting a newNode at end or tail
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null || tail==null){
            head = tail=newNode;
        } else{
            tail.next = newNode;
            newNode.previouse = tail;
            newNode.next = null;
            tail = newNode;
        }
        size++;

    }
    public static void main(String[] args) {
        Doubly_LLL list = new Doubly_LLL();
        list.insertAtFirst(10);
        list.insertAtFirst(11);
        list.insertAtFirst(12);
        list.insertAtFirst(13);
        list.display();
        list.insertAtEnd(14);
        list.display();
    }
}
