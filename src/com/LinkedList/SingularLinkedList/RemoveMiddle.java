package com.LinkedList.SingularLinkedList;

public class RemoveMiddle {
    private Node head;
    private Node tail;
    private int size;
    class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // insert the node
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head= tail=newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    // diplay the linkedlist
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // remove middle node
    public Node removeMiddle(Node head){
        Node slow =head;
        Node fast = head;
        Node previouseNode =null;
        while(fast!=null && fast.next!=null){
            previouseNode=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previouseNode.next = slow.next;
        return head;
    }
    public static void main(String[] args) {
        RemoveMiddle removeMiddle = new RemoveMiddle();
        removeMiddle.insertAtHead(1);
        removeMiddle.insertAtHead(2);
        removeMiddle.insertAtHead(3);
        removeMiddle.insertAtHead(4);
        removeMiddle.insertAtHead(5);
        removeMiddle.display();
        removeMiddle.removeMiddle(removeMiddle.head);
        removeMiddle.display();

    }
}
