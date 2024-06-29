import java.util.*;

public class Diameter1 {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Function to find height of a tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    //Function to find diameter of a tree - time complexity - o(N^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int leftht = height(root.left);
        int rightDiameter = diameter(root.right);
        int rightht = height(root.right);

        int selfDiameter = leftht + rightht +1;
        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    //Function to find diameter of a tree - time complexity - o(N)
    static class  Info {
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
        
    }
    public static Info diameter2(Node root){
            if(root == null){
            return new Info(0, 0);
            }
            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);
            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
            return new Info(diam, ht);
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
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
        System.out.println(diameter2(root).ht);
    }
}
