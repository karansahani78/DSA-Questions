package Tree;

import javax.swing.tree.AbstractLayoutCache;
import java.util.List;
import java.util.Stack;

public class InorderIterative {
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
    public static class ConstructTree{
        static int index=-1;
        public static Node buildTree(int []nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    // Iterative inorder traversalq
    public static List<Integer> inorder(Node root) {
        List<Integer> result = new java.util.ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Node>stack = new Stack<>();
        Node node = root;
        while(!stack.isEmpty() || node!=null){
            while(node!=null){
                // move to the left
                stack.push(node);
                node =node.left;
            }
            // then print the root
            Node currentNode =stack.pop();
            result.add(currentNode.data);
            // now move to the right
            node = currentNode.right;
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = ConstructTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(inorder(root));
    }
}
