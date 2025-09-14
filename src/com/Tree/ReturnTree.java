package com.Tree;

import java.util.ArrayList;
import java.util.List;

import static com.Tree.ReturnTree.BuildTree.inorder;

public class ReturnTree {
    public static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;

        }
    }
    public static class BuildTree{
        static int index =-1;
        public static Node constructTree(int[] arr){
            index++;
            if(arr[index]==-1){
                return null;
            }
            Node newNode = new Node(arr[index]);
            newNode.left = constructTree(arr);
            newNode.right = constructTree(arr);
            return newNode;
        }
        // now Return the Inorder Traversal of the tree
        public static List<Integer>inorder(Node root){
            List<Integer>list = new ArrayList<>();
            helper(root,list);
            return list;

        }
        //  using helper method
        public static void helper(Node node, List<Integer>list){
            if(node==null) return;
            helper(node.left,list);
            list.add(node.data);
            helper(node.right,list);

        }
        // same printing inorder using only one method
        public static List<Integer> inOrder(Node root){
            List<Integer> list = new ArrayList<>();
            if(root==null) return list;
            list.addAll(inOrder(root.left));
            list.add(root.data);
            list.addAll(inOrder(root.right));
            return list;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BuildTree.constructTree(arr);
        System.out.println("Root Node: " + root.data);
        List<Integer> inorderList = inorder(root);
        System.out.println("Inorder Traversal: " + inorderList);

      List<Integer> inOrderList2 = inorder(root);
        System.out.println("Inorder Traversal using inOrder method: " + inOrderList2);
    }
}
