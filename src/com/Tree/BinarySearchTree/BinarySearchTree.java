package com.Tree.BinarySearchTree;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class ConstructTree{
        public static Node buildTree(int[] arr) {
            if (arr.length == 0) {
                return null;
            }
            Node root = new Node(arr[0]); // put the first element of the arr as root
            // then put the remaining arr in  binary search tree
            for (int i = 1; i < arr.length; i++) {
                int val = arr[i];
                // create a new node
                Node newNode = new Node(val); // created this newNode to put on both left and right side of the tree
                Node temp = root;

                while (temp != null) {
                    if (val < temp.data) {
                        // now visit the left sub tree as per the bst property
                        if (temp.left == null) {
                            temp.left = newNode;
                            break;
                        } else {
                            temp = temp.left;
                        }

                    } else {
                        if (temp.right == null) {
                            temp.right = newNode;
                            break;
                        } else {
                            temp = temp.right;
                        }
                    }
                }

            }

            return root;
        }
        }
        // now print the binary search tree lett us inorder traversal
      public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
      }
    }

    public static void main(String[] args) {
        int [] arr = {4, 2, 7, 1, 3};
        Node root = ConstructTree.buildTree(arr);
        System.out.println("Inorder traversal of BST:");
        inOrder(root);
    }
}
