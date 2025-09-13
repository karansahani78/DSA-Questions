package Tree;

public class SubTree {

    // Definition of the Node class for a binary tree
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Method to check if 'subRoot' is a subtree of 'root'
    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) return false;  // If root is null, subRoot can't be a subtree
        // Check if the current subtree is the same as subRoot
        if (isSame(root, subRoot)) return true;
        // Recursively check the left and right subtrees of root
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    // Helper method to check if two trees are identical
    private static boolean isSame(Node a, Node b) {
        if (a == null && b == null) return true;  // Both trees are null, they are identical
        if (a == null || b == null) return false;  // One tree is null and the other is not
        if (a.val != b.val) return false;  // Values don't match
        // Recursively check the left and right children of both trees
        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Root tree
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);

        // SubRoot tree
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        // Check if subRoot is a subtree of root
        boolean result = isSubTree(root, subRoot);

        // Print the result
        System.out.println("Is subRoot a subtree of root? " + result);
    }
}
