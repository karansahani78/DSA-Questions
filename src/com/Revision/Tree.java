package com.Revision;


public class Tree {
    public static class Node {
         Node left;
         Node right;
         int data;

        public Node(int data) {
            this.data = data;
            this.left =null;
            this.right=null;

        }
    }
    // now add the node i.e., construct the nodes
    public static class BinaryTree{
        static int index =-1;
        // method to construct the tree
        public static Node constructTree(int[] nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node root = new Node(nodes[index]);
            root.left = constructTree(nodes);
            root.right = constructTree(nodes);
            return root;
        }
    }
    // to print all the node value
    public static void printNodes(Node root ){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printNodes(root.left);
        printNodes(root.right);

    }

    public static void main(String[] args) {
        int[] nodes = {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
        Node root = BinaryTree.constructTree(nodes);
        System.out.println(root.data);
        printNodes(root);
    }
}
