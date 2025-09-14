package com.Tree;

public class CountTheNode {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left =null;
            this.right =null;
        }
    }
    // create the tree node
    public static class ConstructNode{
        static int index=-1;
        public static Node buildTree(int []nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    // now calculating the node
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
       int  leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount+rightCount+1;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = ConstructNode.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(countNodes(root));
    }
}
