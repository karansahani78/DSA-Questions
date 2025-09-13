package Tree;

public class MaxHeight {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data =data;
            this.left=null;
            this.right=null;
        }
    }
    public static class ConstructTree{
        static int index=-1;
        public static Node buildTree(int []nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node root = new Node(nodes[index]);
            root.left =buildTree(nodes);
            root.right =buildTree(nodes);
            return root;
        }
    }
    // Q.n find the max height of the Tree
    public static int maxHight(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = maxHight(root.left);
        int rightHeight = maxHight(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }

    public static void main(String[] args) {
        int [] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = ConstructTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(maxHight(root));
    }
}
