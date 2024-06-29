import java.util.*;  
public class LowestCommonAncestor{
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Function to get path
    public static boolean getPath(Node root, int n, ArrayList<Node> path){

        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
       boolean foundLeft = getPath(root.left, n, path);
       boolean foundRight = getPath(root.right, n, path);

       if(foundLeft || foundRight){
        return true;
       }

       path.remove(path.size()-1);
       return false;
    }
    //Function to find Lowest common  ancestor of two nodes in a Binary Tree (approach 1) time complexity o(n)
    public static Node lca(Node root, int n1, int n2){  
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);
        //Last common Ancestor
        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //Last equal Node ->i-1th
        Node lca = path1.get(i-1);
        return lca;
    }

     //Function to find Lowest common  ancestor of two nodes in a Binary Tree (approach 2) 
    public static Node lca2(Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node  leftLCA = lca2(root.left ,n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);

        //if leftLCA = valid rightLCA = null
            if (rightLCA == null) {
                return leftLCA;
            }
            if (leftLCA == null) {
                return  rightLCA;
            }

            return root;
    }

    //Helper function to find minimum distance between two nodes
    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data ==n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        else if(leftDist == -1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
    }
//Function to find minumum distance between two nodes
public static int minDistance(Node root, int n1, int n2){
    Node lca = lca2(root, n1, n2);
    int dist1 = lcaDist(lca, n1);
    int dist2 = lcaDist(lca, n2);

    return dist1 + dist2;

}

    //Function to find kth Ancestor
    public static int kAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDis = kAncestor(root.left, n, k);
        int rightDis = kAncestor(root.right, n, k);
        if(leftDis == -1 && rightDis == -1){
            return -1;
        }
        int max = Math.max(leftDis, rightDis);
        if(max + 1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }

    //Function to transforf to sum tree
    public static int transForm(Node root){
        if(root == null){
            return 0;
        }
        int leftChild = transForm(root.left);
        int rightchild = transForm(root.right);

        int data = root.data;
        int newLeft = root.left == null? 0 : root.left.data;
        int newRight = root.right == null? 0 : root.right.data;
        root.data =  newLeft + leftChild + newRight  + rightchild ;
        return data;
    }

    public static void preOrder(Node root){   //TC o(n)
        if(root == null){
            //System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
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
        
        int n1 = 4, n2 = 6;
       //System.out.println(lca(root, n1, n2).data);
       //System.out.println(lca2(root, n1, n2).data);
       System.out.println(minDistance(root, n1, n2));
       int n = 5, k = 1;
       kAncestor(root, n, k);

       System.out.println(transForm(root));
       preOrder(root);
    }
}