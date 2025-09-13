package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderIterative {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
// create a binary tree
 public static class ConstructTree{
        static int indede=-1;
        public static Node buildTree(int []nodes){
            indede++;
            if(nodes[indede]==-1){
                return null;
            }
            Node newNode = new Node(nodes[indede]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
}
// iterative predorder
    public static List<Integer> preorder(Node root){
        List<Integer> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        Stack<Node> stack = new Stack<>();
       stack.push(root);
       while(!stack.isEmpty()){
           Node currentNode = stack.pop();
           result.add(currentNode.data);
           if(currentNode.right!=null){
               stack.push(currentNode.right);
           }
           if(currentNode.left!=null){
               stack.push(currentNode.left);
           }
       }
       return result;
    }

    public static void main(String[] args) {
        int [] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = ConstructTree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println(preorder(root));

    }
}
