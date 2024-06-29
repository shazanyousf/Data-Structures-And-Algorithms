//Write a program to build a binary search tree
import java.util.*;   
public class BuildABst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
       //Insert Function
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

    //Function to search  ---> time complexity --- O(H)
    public static  boolean search(Node root, int key){ 
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
         return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        if(search(root, 6)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
