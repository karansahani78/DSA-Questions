package Tree;

import java.util.Queue;

public class LevelTraversalBFs {
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
    public static class ConstructNode{
        static int index =-1;         public static Node buildTree(int [] nodes){
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
    // level traversal or Breadth First Search (BFS)
    public static void levelTraversal(Node root){
        Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node currentNode = queue.remove();
            if(currentNode==null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                } else{
                    queue.add(null);

                }
            }else{
                System.out.print(currentNode.data);
                if(currentNode.left!=null){
                    queue.add(currentNode.left);

                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = ConstructNode.buildTree(nodes);
        System.out.println(root.data);
        levelTraversal(root);
    }
}
