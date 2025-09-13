package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertNode {
    public static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public static class ConstructTree{
        static int index =-1;
        public static Node buildTree(int [] arr){
            index++;
            if(arr[index]==-1){
                return null;
            }
            Node newNode = new Node(arr[index]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;

        }
        // printing the tree using postorder traversal
        public static void postOrder(Node root){
            if(root==null)return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }
        // inserting a new Node  using level order traversal
        public static void insertNode(Node root, int value){
            if(root==null){
                root = new Node(value);
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                for(int i=0; i<size; i++){
                    Node currentNode = q.poll();
                    if(currentNode.left ==null){
                        currentNode.left = new Node(value);
                        return;
                    }else{
                        q.add(currentNode.left);
                    }
                    if(currentNode.right ==null){
                        currentNode.right = new Node(value);
                        return;
                    }else{
                        q.add(currentNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {11, 12, -1, -1, 13, -1, -1};
        Node root = ConstructTree.buildTree(arr);
        System.out.println("Root Node: " + root.data);
        System.out.println("Postorder Traversal of the tree:");
        ConstructTree.postOrder(root);
        System.out.println("\nInserting a new node with value 14:");
        ConstructTree.insertNode(root, 14);
        System.out.println("Postorder Traversal after insertion:");
        ConstructTree.postOrder(root);
    }
}
