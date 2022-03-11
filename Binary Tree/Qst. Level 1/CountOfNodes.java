import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CountOfNodes{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int indx = -1;
        public static Node buildTree(int[] nodes){
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Counting nodes : time complex : O(n)
    public static int countOfNodes(Node root){
        // base case
        if (root == null) {
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // sum of Nodes : O(n)
    public static int sumOfNodes(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    
    //height of tree : O(n)
    public static int heightOfTree(Node root){
        // base case 
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1; // plus one because we have to add root as well

        return myHeight;
    }


    //Diameter of a Tree :- O(n^2)
    public static int diameter(Node root){
        // base case
        if (root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(dia3, Math.max(dia1, dia2));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    // Diameter of tree : O(N)
    public static TreeInfo diameter2(Node root){
        // base case
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.diam;
        int dia2 = right.diam;
        int dia3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(dia1, dia2),dia3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    //Count leaves in a binary tree
    public static int countLeaves(Node root){
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
    }

    // Count Non-Leaf Nodes in Tree
    public static int countNonLeafNodes(Node root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 0;
        }
        return countLeaves(root.left) + countLeaves(root.right) + 1;

    }
 
    // Iterative preorder traversal In Binary tree  : Tcomplex : O(N) and Scomple O(N) or O(HEIGHT OF THE TREE)
    public static List<Integer> preorderTraversal(Node root){
        List<Integer> preorder = new ArrayList<>();
        if (root == null) {
            return preorder;
        }  

        Stack<Node> st = new Stack<Node>();
        st.push(root);

        while(!st.isEmpty()){
            root = st.pop();
            preorder.add(root.data);
            if (root.right != null) {
                st.push(root.right);
            }

            if (root.left != null) {
                st.push(root.left);
            }
        }
        return preorder;
    }

    // Iterative Inorder Traversal in Binary Tree : TComplex. O(N) and space O(N)
    public static List<Integer> inorderTraversal(Node root){
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> st = new Stack<Node>();
        Node node = root;
        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            }
            else{
                if (st.isEmpty()) {
                    break;    
                }
            node = st.pop();
            inorder.add(node.data);
            node = node.right;
        }
    }
        return inorder;
    }

    //Iterative PostOrder Traversak in Binary Tree : Tcomplex O(N) and Spacecomple O(N)
    public static List<Integer> postOrderTraversal(Node root){
        ArrayList<Integer> postOrder = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        if (root == null) {
            return postOrder;
        }

        st1.push(root);

        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);

            if (root.left != null) {
                st1.push(root.left);
            }
            if (root.right != null) {
                st1.push(root.right);
            }
        }

        while(!st2.isEmpty()){
            postOrder.add(st2.pop().data);
        }

        return postOrder;
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(countOfNodes(root)); 
        // System.out.println(sumOfNodes(root));
        // System.out.println(heightOfTree(root));
        // System.out.println(diameter(root));
        // System.out.println(diameter2(root).diam);
        // System.out.println(countLeaves(root));
        // System.out.println(countNonLeafNodes(root));
        // System.out.println(preorderTraversal(root));
        // System.out.println(inorderTraversal(root));
        System.out.println(postOrderTraversal(root));

    }
}