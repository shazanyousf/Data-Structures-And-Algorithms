
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class BinaryTreeB {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    // Function to build binary tree from preOrder
    public Node buildTree(int nodes[]) {
        
        idx++;

        if(nodes[idx] == -1) {
            return null;
        }    
        
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    // Function to print preorder traversal
    void printPreorder(Node node) {
        if (node == null)
            return;

        // Deal with the node
        System.out.print(node.data + " ");

        // Traverse left subtree
        printPreorder(node.left);

        // Traverse right subtree
        printPreorder(node.right);
    }   

    // Function to print inorder traversal
    void printInorder(Node node) {
        if (node == null)
            return;

        // Traverse left subtree
        printInorder(node.left);

        // Deal with the node
        System.out.print(node.data + " ");

        // Traverse right subtree
        printInorder(node.right);
    }   

    // Function to print postorder traversal
    void printPostorder(Node node) {
        if (node == null)
            return;

        // Traverse left subtree
        printPostorder(node.left);

        // Traverse right subtree
        printPostorder(node.right);

        // Deal with the node
        System.out.print(node.data + " ");
    }  

    // Function to count number of nodes in tree
    int countNodes(Node root)
    {
        if (root == null)
            return 0;
    
        // Count number of nodes in left subtree
        int left_tree_count = countNodes(root.left);

        // Count number of nodes in right subtree
        int right_tree_count = countNodes(root.right);
    

        return 1 + left_tree_count + right_tree_count;
    }

    // Function to calculate sum of tree
    int totalSum(Node root)
    {
        if (root == null)
            return 0;
    
        // Calculate sum of left subtree
        int left_tree_sum = totalSum(root.left);

        // Calculate sum of right subtree
        int right_tree_sum = totalSum(root.right);
    

        return root.data + left_tree_sum + right_tree_sum;
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }
        else {
            // Compute  height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // use the larger one
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    // Prints level order traversal line
    // by line using queue.
    void printLevelOrder(Node root) {
        if (root == null)
            return;
    
        Queue<Node> q = new LinkedList<>();
    
        // Pushing root node into the queue.
        q.add(root);
    
        // Pushing delimiter into the queue.
        q.add(null);
    
        // Executing loop till queue becomes
        // empty
        while (!q.isEmpty()) {
    
            Node curr = q.poll();
        
            // condition to check the
            // occurrence of next level
            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            } 
            else {
                // Pushing left child current node
                if (curr.left != null)
                    q.add(curr.left);
        
                // Pushing right child current node
                if (curr.right != null)
                    q.add(curr.right);
        
                System.out.print(curr.data + " ");
            }
        }
    }

    boolean isUnivalTree(Node root){
        if (root == null){
            return true;
        }
        
        if (root.left != null && root.data != root.left.data)
            return false;
        
        if (root.right != null && root.data != root.right.data)
            return false;
        
        boolean is_left_subtree_unival = isUnivalTree(root.left); 
        if(is_left_subtree_unival == false) {
            return false;
        }

        boolean is_right_subtree_unival = isUnivalTree(root.right);
        if(is_right_subtree_unival == false) {
            return false;
        }

        return true;
    }

    Node mirror(Node node){
        if (node == null)
            return node;
        
        Node newNode = new Node(node.data);

        /* find mirror of left subtrees */
        Node left_mirror = mirror(node.left);

        /* find mirror of left subtrees */
        Node right_mirror = mirror(node.right);

        /* swap the left and right pointers */
        newNode.left = right_mirror;
        newNode.right = left_mirror;

        return newNode;
    }

    static class Info {
        int diameter;
        int height;

        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public Info diameter(Node root) {
        if (root == null) {
            return new Info(0,0);
        }

        Info leftSubTree = diameter(root.left);
        Info rightSubTree = diameter(root.right);

        int diameter = Math.max(Math.max(leftSubTree.diameter, rightSubTree.diameter),
                leftSubTree.height + rightSubTree.height + 1);
        int height = Math.max(leftSubTree.height, rightSubTree.height) + 1;

        return new Info(diameter, height);
    }

    static class QueueObj {
        Node node;
        int hd;

        QueueObj(Node node, int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }

    public void topView(Node root)
    {
        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Node> topViewMap
            = new TreeMap<Integer, Node>();
 
        if (root == null) {
            return;
        }
        else {
            q.add(new QueueObj(root, 0));
        }
 
        System.out.println(
            "The top view of the tree is : ");
 
        while (!q.isEmpty()) {

            QueueObj tmpNode = q.poll();

            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node);
            }
 
            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left,
                                   tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right,
                                   tmpNode.hd + 1));
            }
        }

        for (Map.Entry<Integer, Node> entry :
             topViewMap.entrySet()) {
            System.out.print(entry.getValue().data + " ");
        }
    }

    boolean areIdentical(Node root1, Node root2)
    {
        /* base cases */
        if (root1 == null && root2 == null)
            return true;
 
        if (root1 == null || root2 == null)
            return false;
 
        /* Check if the data of both roots is same and data
           of left and right subtrees are also same */
        return (root1.data == root2.data
                && areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right));
    }
 
    /* This function returns true if S is a subtree of T,
     * otherwise false */
    boolean isSubtree(Node root, Node subTreeRoot)
    {
        /* base cases */
        if (subTreeRoot == null)
            return true;
 
        if (root == null)
            return false;
 
        /* Check the tree with root as current node */
        if (root.data == subTreeRoot.data) {
            if (areIdentical(root, subTreeRoot)) {
                return true;
            }
        }    
        
        /* If the tree with root as current node doesn't
           match then
           try left and right subtrees one by one */
        return isSubtree(root.left, subTreeRoot) || isSubtree(root.right, subTreeRoot);
    }

    static Node deleteLeaves(Node root, int x){
        if (root == null)
            return null;
        
        // Delete leaf node in right subtree
        root.left = deleteLeaves(root.left, x);

        // Delete leaf node in left subtree
        root.right = deleteLeaves(root.right, x);

        // If leaf node and value equal to given val (x), remove that node from tree
        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }

    static HashMap<String, Integer> m;

    static String inorder(Node node){
        if (node == null)
            return "";

        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";

        if (m.get(str) != null && m.get(str)==1 )
            System.out.print( str + " ");
        
        if (m.containsKey(str))
            m.put(str, m.get(str) + 1);
        else
            m.put(str, 1);
        
        return str;
    }
        
    static void printAllDups(Node root){
        m = new HashMap<>();
        inorder(root);
    }

    int val;

    int findMaxUtil(Node node) {

        if (node == null)
            return 0;

        // Find max in left subtree
        int l = findMaxUtil(node.left);

        // Find max sum in right subtree
        int r = findMaxUtil(node.right);

        // Find max sum height starting from this node
        int max_single = Math.max(Math.max(l, r) + node.data, node.data);

        // Find max sum path containing this node.
        int max_top = Math.max(max_single, l + r + node.data);

        // Store max path
        val = Math.max(val, max_top);
    
        // Return max sum height
        return max_single;
    }
    
    int findMaxSum(Node node) {
    
        val = Integer.MIN_VALUE;    
        findMaxUtil(node);
        return val;
    }

    public static void main(String[] args) {
        
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = {2, 2, 2, -1, -1, 2, -1, -1, 2, -1, 2, -1, -1 };
        BinaryTreeB tree = new BinaryTreeB();
        Node root = tree.buildTree(nodes);

        if (tree.isUnivalTree(root)) {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
