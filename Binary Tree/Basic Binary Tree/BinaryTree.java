import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{

    // this node class will represent the single node of the tree
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

    static class BinaryTreee{
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

    // PreOrder traversal 
    public static void preorderTraversal(Node root){  // Time Complexity : O(n)
        // base case 
        if (root == null) {
            // System.out.print("-1");
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // InOrder Traversal
    public static void inorderTraversal(Node root){  // Time Complexity : O(n)
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

    //PostOrder Traversal
    public static void postOrder(Node root){  // Time Complexity : O(n)
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    // level Order Traversal 
    public static void levelOrder(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        BinaryTreee tree = new BinaryTreee();
        Node root = tree.buildTree(nodes);

        // System.out.println(root);
        // preorderTraversal(root);
        // inorderTraversal(root);
        // postOrder(root);
        levelOrder(root);
    }
}