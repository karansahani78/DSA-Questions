package com.Tree;

public class SumNode {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BuildTree{
         static int index =-1;
        public static Node Tree(int [] nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = Tree(nodes);
            newNode.right = Tree(nodes);
            return newNode;
        }
    }
    // now print the nodes  using preorder
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println( " " + root.data);
        preorder(root.left);
        preorder(root.right);
    }
    // now sum of the nodees
      public static int sumnNode(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = sumnNode(root.left);
        int rightSum = sumnNode(root.right);
        return rightSum + leftSum + root.data;
      }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BuildTree.Tree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println(sumnNode(root));
    }
}
