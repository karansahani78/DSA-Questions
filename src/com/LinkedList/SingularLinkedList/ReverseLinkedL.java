package com.LinkedList.SingularLinkedList;

import java.util.Stack;

public class ReverseLinkedL {
    private Node head;
    private Node tail;
    private int size;
    public class Node{
        private Node next;
        private int val;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    // insert the node at first
    public void insertAStart(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=tail=newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    // reverse the linkedList using stack LIFO
    public static Node reverse(Node head){
        if(head==null){
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp!=null){
            stack.push(temp.val);
            temp= temp.next;
        }
        // now reset the head to restore the data
        temp = head;
        while(temp!=null){
           temp.val  = stack.pop();
            temp=temp.next;
        }
        return head;

    }
    // reversing the linkedlist without Stack
    public static Node reverseLinkedList(Node head){
        if(head==null){
            return null;

        }
        Node back = null;
        Node  front =null;
        Node temp = head;
        while(temp!=null){
            front = temp.next;
            temp.next = back;
            // now back become temp
            back = temp;
            // temp become front
            temp = front;
        }
        return back;
    }
    // display the value of the linkedlist
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val + " ->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLinkedL reverseLinkedL = new ReverseLinkedL();
        reverseLinkedL.insertAStart(1);
        reverseLinkedL.insertAStart(2);
        reverseLinkedL.insertAStart(3);
        reverseLinkedL.insertAStart(4);
        reverseLinkedL.insertAStart(5);
        reverseLinkedL.display();
        reverseLinkedL.head = reverseLinkedL.reverse(reverseLinkedL.head);
        reverseLinkedL.display();
        reverseLinkedL.head = reverseLinkedL.reverseLinkedList(reverseLinkedL.head);
        reverseLinkedL.display();

    }
}
