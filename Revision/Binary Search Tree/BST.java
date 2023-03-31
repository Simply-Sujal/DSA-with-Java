import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // The time complexity for creating a tree is O(1) . The time complexity for
    // searching, inserting or deleting a node depends on the height of the tree h ,
    // so the worst case is O(h) in case of skewed trees.
    // creating the binary search tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder tree traversal : which will give me the values int sorted manner
    public static void InOreder(Node root) {
        if (root == null)
            return;
        InOreder(root.left);
        System.out.print(root.data + " ");
        InOreder(root.right);
    }

    // PreOrder tree traversal :
    public static void PreOreder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        InOreder(root.left);
        InOreder(root.right);
    }

    // Search a key in binary search tree : T.C : O(h) : h is the height of tree
    public static boolean Searchkey(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        // if (key < root.data) {
        // return Searchkey(root.left, key);
        // } else if (key > root.data) {
        // return Searchkey(root.right, key);
        // }

        boolean ans = key > root.data ? Searchkey(root.right, key) : Searchkey(root.left, key);
        return ans;
    }

    // delete a node from bst
    public static Node delete(Node root, int val) {

        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // 1. leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // 2. Single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // 3. both children
            Node IS = findInorderSuccessor(root.right); // finding inordersuccessor
            root.data = IS.data; // replace the value
            root.right = delete(root.right, IS.data); // go to right subtree and delete inordersuccesor node
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // printing in a range
    public static void PrintInRange(Node root, int k1, int k2) {
        // base case
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right, k1, k2);
        } else if (root.data > k2) {
            PrintInRange(root.right, k1, k2);
        } else {
            PrintInRange(root.left, k1, k2);
        }
    }

    // print root to leaf of a binary search tree
    public static void PrintRootToLeaf(Node root, ArrayList<Integer> path) {
        // base case
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        PrintRootToLeaf(root.left, path);
        PrintRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // printing the path
    private static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    // valid bst
    public static boolean IsValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }

        return IsValidBST(root.left, min, root) && IsValidBST(root.right, root, max);
    }

    // mirror of the binary search tree
    public static Node createMirror(Node root) {
        // base case
        if (root == null)
            return null;

        // creating mirror for left subtree
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    // creating a bst with minimum height , here sorted array is given to us
    public static Node createTree(int nums[], int start, int end) {
        // base case
        if (start > end) {
            return null;
        }
        // calculate the mid
        int mid = (start + end) / 2;
        Node root = new Node(nums[mid]);
        root.left = createTree(nums, start, mid - 1);
        root.right = createTree(nums, mid + 1, end);
        return root;
    }

    // Size of largest bst in bt
    // we weill make a sepatrate class to gather info in one place
    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // now checking for tht valid bst condition
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    // ------- xxxxxxxx ---------

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }

    public static Node createBST(ArrayList<Integer> ans, int start, int end) {
        // base case
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        Node root = new Node(mid);
        root.left = createBST(ans, start, mid - 1);
        root.right = createBST(ans, mid + 1, end);
        return root;
    }

    // Merge 2 BST'S
    public static Node MergerBST(Node root1, Node root2) {

        // Step 1 : calculating the left subtree inorder sequence
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        // step 2 : calculating the right subtree inorder sequence
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merging process
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                ans.add(arr1.get(i));
                i++;
            } else {
                ans.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            ans.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            ans.add(arr2.get(i));
            j++;
        }

        // sorted array -> we have to create a balance bst
        return createBST(ans, 0, ans.size() - 1);
    }

    public static void main(String[] args) {
        // int values[] = { 5, 1, 3, 4, 2, 7 };
        // int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        // Node root = null;

        // for (int i = 0; i < values.length; i++) {
        // root = insert(root, values[i]);
        // }
        // root = insert(root, 5);
        // insert(root, 1);
        // insert(root, 3);
        // insert(root, 4);
        // insert(root, 2);
        // insert(root, 7);

        // System.out.println("BST : ");
        // InOreder(root);
        // System.out.println();
        // if (Searchkey(root, 4)) {
        // System.out.println("Value Found In BST");
        // } else {
        // System.out.println("Value Not Found In BST");
        // }

        // root = delete(root, 10);
        // System.out.println("New Binary Search tree after deleting the node : ");
        // InOreder(root);

        // printing in a range
        // System.out.println("The elements exists in a range : ");
        // PrintInRange(root, 5, 10);

        // printing root to leaf
        // System.out.println("Printing the nodes from leaf to root ");
        // PrintRootToLeaf(root, new ArrayList<>());

        // is valid bst or not
        // if (IsValidBST(root, null, null)) {
        // System.out.println("Valid BST");
        // } else {
        // System.out.println("Not Valid BST");
        // }

        // mirror image
        // createMirror(root);
        // InOreder(root);

        // creating a bst with minimu height
        // int nums[] = { 3, 5, 6, 8, 10, 11, 12 };
        // Node root1 = createTree(nums, 0, nums.length - 1);
        // PreOreder(root1);

        // size of largest bst in bt
        // Info in = largestBST(root);
        // System.out.println("Largest BST size = " + maxBST);
    }
}