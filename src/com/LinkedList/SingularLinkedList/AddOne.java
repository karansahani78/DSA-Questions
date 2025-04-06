package com.LinkedList.SingularLinkedList;

public class AddOne {
    private Node head;
    private Node tail;
    private int size;

    public class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Add node to beginning
    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse helper
    public Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        Node front;
        while (current != null) {
            front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
    }

    // Add 1 to the linked list
    public Node addOne(Node head) {
        head = reverse(head);
        Node temp = head;
        int carry = 1;

        while (temp != null) {
            temp.val += carry;
            if (temp.val < 10) {
                carry = 0;
                break;
            } else {
                temp.val = 0;
                carry = 1;
            }
            temp = temp.next;
        }
// reverse again to restore original order
        head = reverse(head);
        // if still carry remains after full traversal
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
           return newNode;
        }else{
            return  head;
        }
    }

    public static void main(String[] args) {
        AddOne list = new AddOne();
        list.addFirst(9);
        list.addFirst(9);
        list.addFirst(9);

        System.out.println("Original list:");
        list.display();

        list.head = list.addOne(list.head);  // Update head with result

        System.out.println("After adding one:");
        list.display();
    }
}
