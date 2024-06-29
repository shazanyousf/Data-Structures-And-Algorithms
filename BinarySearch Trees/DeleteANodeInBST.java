//Write a program to delete a node in BST
import java.util.*;   
public class DeleteANodeInBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //Left Subtree
            root.left = insert(root.left, val);
        }
        else if(root.data < val) {
            //Right Subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    //Inorder Function
    public static void inOrder(Node root){     //TC o(n)
        if(root == null){
            System.out.print(" ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //Function to delete a node in binary search tree
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{//Voila
            //Case 1 -- leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //Case 2 --- single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //Case 3 -- two children
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right ,IS.data );
        }
        return root;
    }
    //Heper function to delete a node in binary search tree
    public static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    //Function to print in range
    public static void printInRange(Node root, int k1, int k2){
        if (root == null) {
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    //Helper Function to find root to leaf path
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    //Function to find root to leaf path
    public static void rootToLeafPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        rootToLeafPath(root.left, path);
        rootToLeafPath(root.right, path);
        path.remove(path.size()-1);
    }

    //Function to check if a BST is valid or not
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        // root = delete(root, 1);
        // System.out.println();

        // inOrder(root);
        // System.out.println();

        // root = delete(root, 10);
        // System.out.println();

        // inOrder(root);
        // System.out.println();

        // root = delete(root, 5);
        // System.out.println();

        // inOrder(root);
        // System.out.println();

        // printInRange(root, 5, 12);
        // System.out.println();

        // rootToLeafPath(root, new ArrayList<>());
         if(isValidBST(root, null, null)){
            System.out.println("Valid");
         }
         else{
            System.out.println("Not valid");
         }
    }
}

