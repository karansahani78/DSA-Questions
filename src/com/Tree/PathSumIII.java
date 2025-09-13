package Tree;

public class PathSumIII {
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Construct{
        static int index =-1;
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
    // PathSumIII is a problem where we need to find the number of paths that sum to a given value.
    public static class PathSum{
        int count =0;
        public int pathSum(Node root, int targetSum){
            if(root==null) return 0;
            countPath(root, targetSum);
            pathSum(root.left, targetSum);
            pathSum(root.right, targetSum);
            return count;

        }
        public void countPath(Node root, long sum){
            if(root ==null) return;
            if(root.data==sum){
                count++;
            }
            countPath(root.left, sum-root.data);
            countPath(root.right, sum-root.data);

        }
    }

    public static void main(String[] args) {
       int [] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       Node root = Construct.buildTree(nodes);
         System.out.println("Root: " + root.data);
     PathSum pathSum = new PathSum();
     int targetSum = 6; // Example target sum
        int resutl = pathSum.pathSum(root, targetSum);
        System.out.println("Number of paths with sum " + targetSum + ": " + resutl);


    }
}
