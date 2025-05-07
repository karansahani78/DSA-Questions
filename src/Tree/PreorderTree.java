package Tree;


public class PreorderTree {
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

    static class BuilTree {
        static int index = -1;

        public static Node constructTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            // create new node
            Node newNode = new Node(nodes[index]);
            newNode.left = constructTree(nodes);
            newNode.right = constructTree(nodes);
            return newNode;
        }
    }
        // preorder sequence i.e printing the value of each node of tree
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // now we have to create a static class to build the tree
        public static void main(String[] args) {
            int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            PreorderTree tree = new PreorderTree();
            Node root = BuilTree.constructTree(nodes);
            System.out.println(root.data);
            preorder(root);

        }
    }
