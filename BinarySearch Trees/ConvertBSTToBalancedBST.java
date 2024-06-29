//Convert BST to Balanced BST
import java.lang.reflect.Array;
import java.util.*;
public class ConvertBSTToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    //Preorder Function
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //Function to convert sorted array to balanced BST
    public static Node createBST(int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end )/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
        //Inorder Function
        public static void getInorder(Node root, ArrayList<Integer> inOrder){
            if(root == null){
                return;
            }
            getInorder(root.left, inOrder);
            inOrder.add(root.data);
            getInorder(root.right, inOrder);
        }
        //Function to convert sorted array to balanced BST
    public static Node createBST(ArrayList<Integer> inOrder, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end )/2;
        Node root = new Node(inOrder.get(mid));
        root.left = createBST(inOrder, start, mid-1);
        root.right = createBST(inOrder, mid+1, end);
        return root;
    }
    //Function to convert BST to Balanced BSt
    public static Node balancedBST(Node root){
        //Inorder Sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInorder(root, inOrder);

        //Sorted inOrder ---> Balanced BST
        root = createBST(inOrder, 0, inOrder.size()-1);
        return root;
    }
    public static void main(String[] args) {

        /*               8        Given BST
                        / \
                       6   10
                      /      \
                     5        11
                    /          \
                   3            12
         */
        
         Node root = new Node(8);
         root.left = new Node(6);
         root.left.left = new Node(5);
         root.left.left.left = new Node(3);
         root.right = new Node(10);
         root.right.right = new Node(11);
         root.right.right.right = new Node(12);

        
        /*               8        Expected BST
                       /   \
                      5     11
                    / \     / \
                   3   6   10   12
         */
       root = balancedBST(root);
       preOrder(root);
    }
}
