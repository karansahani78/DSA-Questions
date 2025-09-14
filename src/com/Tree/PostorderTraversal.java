package com.Tree;

public class PostorderTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data =data;
            this.left =null;
            this.right=null;
        }
    }
    // let's create the nodes first using a static class
    static class buildTree{
        static int index=-1;
        public static Node createTree(int []nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = createTree(nodes);
            newNode.right = createTree(nodes);
            return newNode;

        }
    }
    // now postorder traversal
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree.createTree(nodes);
        System.out.println(root.data);
        postOrder(root);
    }
}
