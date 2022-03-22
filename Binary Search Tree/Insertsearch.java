public class Insertsearch {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){
        root = insert(root,value);
    }

    public TreeNode insert(TreeNode root , int value){
        // base case 
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        }else{
            root.right = insert(root.right, value); 
        }
        return root;
    }

    public void inorder(){
        inorder(root);
    }

    public void inorder(TreeNode root){
        // base case 
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    // Search for the particular key present in the Binary Search Tree
    public TreeNode search(int key){
        return search(root,key);
    }

    public TreeNode search(TreeNode root, int key){
        // base case 
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }

    }

    public static void main(String[] args) {
        Insertsearch bst = new Insertsearch();
        bst.insert(10);
        bst.insert(5);
        bst.insert(23);
        bst.insert(100);
        bst.insert(25);
        bst.insert(19);

        bst.inorder();

        if (null != bst.search(101)) {
            System.out.println("Key Found");
        }else{
            System.out.println("Key is not available");
        }
    }
}
