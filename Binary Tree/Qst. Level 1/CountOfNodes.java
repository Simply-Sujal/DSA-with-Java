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


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(countOfNodes(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(heightOfTree(root));
        System.out.println(diameter(root));
    }
}