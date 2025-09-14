package com.LinkedList.SingularLinkedList;

public class AddTwoList {
    private Node head;
    private Node tail;
    private int size;

    public class Node {
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

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
    }
    // Remove leading zeros
    public Node removeLeadingZeros(Node head) {
        while (head != null && head.data ==0  && head.next != null) {
            head = head.next;
        }
        return head;
    }

    public Node addTwoLists(Node list1, Node list2) {
        list1 = reverse(list1);
        list2 = reverse(list2);

        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;

        while (list1 != null || list2 != null || carry != 0) {
            int sum = carry;
            if (list1 != null) {
                sum += list1.data;
                list1 = list1.next;
            }
            if (list2 != null) {
                sum += list2.data;
                list2 = list2.next;
            }

            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
        }

        Node result = reverse(dummy.next);
        return removeLeadingZeros(result);
    }

    public static void main(String[] args) {
        AddTwoList list = new AddTwoList();
        AddTwoList list1 = new AddTwoList();
        AddTwoList list2 = new AddTwoList();

        list1.insertAtHead(3);
        list1.insertAtHead(4);
        list1.insertAtHead(2); // 2 -> 4 -> 3 (represents 243)

        list2.insertAtHead(4);
        list2.insertAtHead(6);
        list2.insertAtHead(5); // 5 -> 6 -> 4 (represents 564)

      Node result = list.addTwoLists(list1.head, list2.head);
      list.display(result);
    }
}
