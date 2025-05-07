package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class KthSumOfNode {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class ConstructTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node root = new Node(nodes[index]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
    }

    // Sum of the Kth level nodes of the tree
    public static int sumOfKthNode(Node root, int k) {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        int sum = 0;

        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            sum = 0; // Reset sum for each level

            // Process nodes at the current level
            for (int i = 0; i < currentLevelSize; i++) {
                Node currentNode = queue.poll();

                // If we are at the kth level, add the node data to the sum
                if (level == k) {
                    sum += currentNode.data;
                }

                // Add child nodes to the queue
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            // If we have processed the kth level, return the sum
            if (level == k) {
                return sum;
            }

            // Move to the next level
            level++;
        }

        // If Kth level doesn't exist, return 0
        return 0;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = ConstructTree.buildTree(nodes);

        // Test case for sum at Kth level
        int K = 2;
        int sum = sumOfKthNode(root, K);
        System.out.println("Sum of nodes at level " + K + ": " + sum);
    }
}
