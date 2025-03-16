package com.LinkedList.DoublyLinkedList;

public class Doubly_LLL {
    private Node head;
    private Node tail;
    private int size;

    public class Node {
        private int data;
        private Node next;
        private Node previouse;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previouse = null;
        }
    }

    //  Insert at the first position
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previouse = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previouse = tail;
            tail = newNode;
        }
        size++;
    }

    // Insert at any position (handles first & last positions correctly)
    public void insertAtAnyPosition(int data, int position) {
        if (position <= 0 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        // Case 1: Insert at the first position
        if (position == 1) {
            insertAtFirst(data);
            return;
        }

        // Case 2: Insert at the last position
        if (position == size + 1) {
            insertAtEnd(data);
            return;
        }

        // Case 3: Insert in the middle
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {  // Traverse to (position - 1) node
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.previouse = temp;
        if (temp.next != null) {  // If inserting before the last node
            temp.next.previouse = newNode;
        }
        temp.next = newNode;

        size++;
    }

    // Display the linked list (forward & reverse)
    public void display() {
        Node temp = head;
        Node last = null;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        // Reverse traversal
        System.out.print("Reverse: ");
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.previouse;
        }
        System.out.println("START");
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
        list.insertAtAnyPosition(20, 3);
        list.display();
    }
}
