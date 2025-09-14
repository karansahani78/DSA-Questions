package com.Tree;

public class InorderTraversal {
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
    // now consturct the node using a class
    public static class ConstructNode{
        static int index=-1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node root = new Node(nodes[index]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
    }
    // Inorder traversal
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = ConstructNode.buildTree(nodes);
        System.out.println(root.data);
        inorder(root);
    }
}
