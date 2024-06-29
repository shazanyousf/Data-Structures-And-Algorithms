import java.util.*;
public class HeightOfTree {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
     //Count of Nodes
     public static int countOfNode(Node root){
        if(root == null){
            return 0;
        }
            int leftCount = countOfNode(root.left);
            int rightCount = countOfNode(root.right);
            return leftCount+rightCount+1;
    }
   
    //Sum of Nodes
    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }
            int leftSum = sumOfNode(root.left);
            int rightSum = sumOfNode(root.right);
            return leftSum+rightSum+root.data;
    }
    public static void main(String[] args) {

        /*           1
         *          / \
         *         2   3
         *        /\   /\
         *       4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(height(root));
        System.out.println(countOfNode(root));
        System.out.println(sumOfNode(root));
    }
}
