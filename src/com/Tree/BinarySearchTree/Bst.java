package com.Tree.BinarySearchTree;

public class Bst {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Class to construct the BST iteratively
    public static class ConstructTree {
        public static Node createBst(int[] nodes) {
            if (nodes.length == 0) return null;

            Node root = new Node(nodes[0]); // create root from first element

            // Insert remaining elements one by one
            for (int i = 1; i < nodes.length; i++) {
                int val = nodes[i];
                Node newNode = new Node(val);
                Node temp = root;

                while (true) {
                    if (val < temp.data) {
                        // Go to left subtree
                        if (temp.left == null) {
                            temp.left = newNode;
                            break;
                        } else {
                            temp = temp.left;
                        }
                    } else {
                        // Go to right subtree
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

    // In-order traversal to print BST
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {4, 2, 7, 1, 3};
        Node root = ConstructTree.createBst(nodes);
        System.out.println("Inorder traversal of BST:");
        inorder(root);
    }
}
