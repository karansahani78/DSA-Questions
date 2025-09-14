package com.LinkedList.DoublyLinkedList;

import java.util.ArrayList;

public class PairSumBruteForce {
    private Node head;
    private Node tail;
    private int size;
    public class Node{
        private int data;
        private Node next;
        private Node prev;
        public Node(int  data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    // insert into linkedlist
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail=newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    // display linkedlist
    public void display(){
        Node temp = head;
        System.out.print( "null <- " );
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
    }
    // bruteforec approach
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(head==null){
            return result;
        }
        for(Node i = head; i!=null; i=i.next){
            for(Node j=i.next; j!=null; j=j.next){
                if(i.data +j.data ==target){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(i.data);
                    pair.add(j.data);
                    result.add(pair);
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        PairSumBruteForce list = new PairSumBruteForce();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.display();
        System.out.println("Pairs with sum 7:");
        findPairsWithGivenSum(7, list.head)
                .forEach(pair -> System.out.println(pair.get(0) + " + " + pair.get(1)));


    }
}
