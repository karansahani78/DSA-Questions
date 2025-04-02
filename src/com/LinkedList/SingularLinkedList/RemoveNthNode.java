package com.LinkedList.SingularLinkedList;

import org.jetbrains.annotations.Nullable;

public class RemoveNthNode {
    private Node head;
    private Node tail;
    private int size;

    public class Node{
        private Node next;
        private int data;
        public Node(int  data){
            this.data = data;
            this.next=null;
        }
    }
    // method to insert new node at start
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        if(head==null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head= newNode;
        }
    }
    // method to insert new node at end ;
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    // method to display the linkedlist
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data  + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    // Remove Nth node
    public void removeNthNode(int n){
        /*
        first we have to calculate the length of the list
         */
        int length =0;
        Node temp = head;
        while(temp!=null){
            length++;
            temp= temp.next;
        }
        // if n == length means we have to remove head
        if(n==length){
            head=head.next;
            if(head==null){
                tail=null;
            }
        }
        // now reset the head
        temp = head;
        //Traverse to the node before the one to be deleted
        for(int i = 1; i<length-n; i++){
            temp= temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
        RemoveNthNode removeNthNode = new RemoveNthNode();
        removeNthNode.insertAtStart(1);
        removeNthNode.insertAtStart(2);
        removeNthNode.insertAtStart(3);
        removeNthNode.insertAtEnd(4);
        removeNthNode.display();
        removeNthNode.removeNthNode(3);
        removeNthNode.display();


    }
}
