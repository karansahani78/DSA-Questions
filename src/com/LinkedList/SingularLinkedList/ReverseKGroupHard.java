package com.LinkedList.SingularLinkedList;

public class ReverseKGroupHard {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // reverse the Node in k
    public static Node reverseKGroup(Node head, int k) {
        Node temp = head;
        int count =0;
        while(temp!=null && count<k){
            temp = temp.next;
            count++;
        }
        // we have to revers the node that are equall to k
        if (count==k){
            Node current =head;
            Node next = null;
            Node prev =null;
            for(int i = 0; i<k; i++){
                next= current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            // now then reverse the second group for that recursively call the first function of reverse
            head.next = reverseKGroup(current,k);
            return prev;
        }
        return head;
    }


    public static void main(String[] args) {
        ReverseKGroupHard list = new ReverseKGroupHard();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.display();
        list.head = reverseKGroup(list.head, 3);
        list.display();
    }
}
