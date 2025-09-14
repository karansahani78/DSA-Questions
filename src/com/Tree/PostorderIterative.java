package com.Tree;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostorderIterative {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class ConstructTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // ✅ Iterative Postorder Traversal
    public static List<Integer> postorder(Node root) {
        List<Integer> result = new java.util.ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            result.add(currentNode.data);

            // 🧠 Push left after right (reverse preorder logic)
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
        }
        Collections.reverse(result); // 🔄 Reverse to get postorder
        return result;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = ConstructTree.buildTree(nodes);
        System.out.println("Root: " + root.data);
        System.out.println("Postorder Traversal: " + postorder(root));
    }
}
