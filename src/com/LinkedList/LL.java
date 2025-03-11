package com.LinkedList;

public class LL {
    private Node head; // First node of the linked list
    private Node tail; // Last node of the linked list
    private int size;  // Keeps track of the number of nodes

    // Node class representing each element in the linked list
    private class Node {
        int data;  // Stores the value
        Node next; // Points to the next node

        Node(int data) {
            this.data = data; // Assign the given value
        }
    }

    // Method to add a node at the beginning of the list
    public void addAtFirst(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // New node points to the current head
        head = newNode; // Update head to the new node
        if (tail == null) { // If the list was empty, update tail
            tail = newNode;
        }
        size++; // Increase the size count
    }

    // Method to insert a node at any position in the list
    public void insertAtPosition(int data, int position) {
        if (position < 0 || position > size) { // Check for valid position
            System.out.println("Invalid position!"); // Print error message
            return;
        }

        Node newNode = new Node(data); // Create a new node

        if (position == 0) { // If inserting at the beginning
            newNode.next = head; // New node points to current head
            head = newNode; // Update head to the new node
            if (tail == null) { // If the list was empty, update tail
                tail = newNode;
            }
        } else { // If inserting at any other position
            Node temp = head; // Start from the head
            for (int i = 0; i < position - 1; i++) { // Move to the previous node
                temp = temp.next;
            }
            newNode.next = temp.next; // New node points to the next node
            temp.next = newNode; // Previous node points to new node
            if (newNode.next == null) { // If inserted at the last position
                tail = newNode; // Update tail
            }
        }
        size++; // Increase the size count
    }

    // Method to add a node at the end of the list
    public void addAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node

        if (head == null) { // If the list is empty
            head = tail = newNode; // New node becomes head and tail
        } else {
            tail.next = newNode; // Last node points to the new node
            tail = newNode; // Update tail to new node
        }

        size++; // Increase the size count
    }

    // Method to delete the first node
    public void deleteFirstNode() {
        if (head == null) {  // If the list is empty
            System.out.println("List is empty!"); // Print error message
            return;
        }

        head = head.next;  // Move head to the next node

        if (head == null) {  // If the list becomes empty after deletion
            tail = null; // Update tail to null
        }

        size--; // Decrease the size count
    }

    // Method to delete the last node
    public void deleteLast() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty!"); // Print error message
            return;
        }

        if (head.next == null) { // If there is only one node
            head = tail = null; // Remove the only node
        } else {
            Node temp = head; // Start from the head
            while (temp.next.next != null) { // Move to the second-last node
                temp = temp.next;
            }
            temp.next = null; // Remove the last node
            tail = temp; // Update tail
        }
        size--; // Decrease the size count
    }

    // Method to print all the nodes in the linked list
    public void display() {
        Node temp = head; // Start from the head
        while (temp != null) { // Traverse until the end
            System.out.print(temp.data + " -> "); // Print node value
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }

    // Main method to test the linked list operations
    public static void main(String[] args) {
        LL list = new LL(); // Create a linked list object

        // Add elements at the beginning
        list.addAtFirst(15);
        list.addAtFirst(14);
        list.addAtFirst(13);
        list.addAtFirst(12);

        // Add element at the end
        list.addAtEnd(20);

        // Display the initial list
        System.out.println("Original List:");
        list.display();

        // Insert at position 2 (0-based index)
        list.insertAtPosition(100, 2);
        System.out.println("After inserting 100 at position 2:");
        list.display();

        // Delete the first node
        list.deleteFirstNode();
        System.out.println("After deleting first node:");
        list.display();

        // Delete the last node
        list.deleteLast();
        System.out.println("After deleting last node:");
        list.display();
    }
}
