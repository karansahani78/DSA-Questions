package com.Tree;

public class MaxDiameter {
    public static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
    }

    public static class ConstructTree {
        static int index = -1;
        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) return null;
            Node root = new Node(nodes[index]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
    }

    static int maxDiameter = 0;

    public static int height(Node root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter(Node root) {
        height(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        Node root = ConstructTree.buildTree(nodes);
        System.out.println("Root: " + root.data);
        System.out.println("Diameter: " + diameter(root));
    }
}
