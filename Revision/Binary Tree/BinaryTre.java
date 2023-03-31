import java.util.*;

// Here we will build binary tree along with the best question.

public class BinaryTre {
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

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // preorder traversal
        public void PreOrder(Node root) { // T.C : O(N)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

        // Inorder Trvaersal
        public void InOrder(Node root) {
            if (root == null) {
                return;
            }
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }

        // PostOrder Trvaersal
        public void PostOrder(Node root) {
            if (root == null) {
                return;
            }
            InOrder(root.left);
            InOrder(root.right);
            System.out.print(root.data + " ");
        }

        // LevelOrder Traversal using queue data structure
        // T.C : O(n)
        public void LevelOrder(Node root) {
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
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // height of the tree : T.C : O(n)
        public int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftTree = heightOfTree(root.left);
            int RightTree = heightOfTree(root.right);

            if (leftTree > RightTree) {
                leftTree = leftTree + 1;
                return leftTree;
            }
            return RightTree + 1;
        }

        // count the number of nodes in BT : T.C : O(n)
        public int CountNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int countLeft = CountNodes(root.left);
            int countRight = CountNodes(root.right);
            int totalNodes = countLeft + countRight + 1;
            return totalNodes;
        }

        // Sum of nodes in BT : T.C : O(n)
        public int SumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int countLeft = SumOfNodes(root.left);
            int countRight = SumOfNodes(root.right);
            int totalSum = countLeft + countRight + root.data;
            return totalSum;
        }

        // find the diameter of a tree : T.C : O(N^2)
        public int diameterofTree(Node root) {
            // base case
            if (root == null) {
                return 0;
            }
            int leftDiam = diameterofTree(root.left);
            int rightDiam = diameterofTree(root.right);
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            int selfDiameter = leftHeight + rightHeight + 1;
            int maxinDiam = Math.max(rightDiam, leftDiam);
            return Math.max(selfDiameter, maxinDiam);

            // or we can write
            // return Math.max(selfDiameter , Math.max(leftDiam , rightDiam))
        }

        // optimize code to determine the longest diameter of the tree : 0(n)
        static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public Info diameter1(Node root) {
            // base case
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = diameter1(root.left);
            Info rightInfo = diameter1(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), (leftInfo.ht + rightInfo.ht + 1));
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam, ht);
        }

        // Finding the top view of the binary tree
        static class Information {
            Node node;
            int horizonaldist;

            public Information(Node node, int horizonaldist) {
                this.node = node;
                this.horizonaldist = horizonaldist;
            }
        }

        public void topView(Node root) {
            // Level order traversal
            Queue<Information> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0;
            int max = 0;
            q.add(new Information(root, 0));
            q.add(null);
            while (!q.isEmpty()) {
                Information currElement = q.remove();
                if (currElement == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    // first time my horizontal distance is occuring
                    if (!map.containsKey(currElement.horizonaldist)) {
                        map.put(currElement.horizonaldist, currElement.node);
                    }

                    // this check is for the left portion of the tree
                    if (currElement.node.left != null) {
                        q.add(new Information(currElement.node.left, currElement.horizonaldist - 1));
                        min = Math.min(min, currElement.horizonaldist - 1);
                    }

                    // this check is for the right portion of the tree
                    if (currElement.node.right != null) {
                        q.add(new Information(currElement.node.right, currElement.horizonaldist + 1));
                        max = Math.max(max, currElement.horizonaldist + 1);
                    }
                }

            }

            // for printing purpose we will iterate throuh min horizontal dist to max. horiz
            // dist
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }

        // Kth level of the tree : O(N)
        public void KthLevelIterative(Node root) {
            if (root == null) {
                return;
            }
            int k = 1;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    k++;
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else if (k == 3) {
                    System.out.print(currNode.data + " ");
                } else {
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // Kth level Recursively : O(n)
        public void KthLevelRecursively(Node root, int level, int k) {
            // base case
            if (root == null)
                return;

            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }
            KthLevelRecursively(root.left, level + 1, k);
            KthLevelRecursively(root.right, level + 1, k);
        }

        // Lowest Common Ancestor
        public Node LCA(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            // last common ancestor
            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lca = path1.get(i - 1);
            return lca;
        }

        // calculating the path
        public boolean getPath(Node root, int n, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }

            path.add(root);

            if (root.data == n) {
                return true;
            }

            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if (foundLeft || foundRight) {
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }

        // 2nd approach to Lowest Common Ancestor
        public Node LCA2(Node root, int n1, int n2) {
            // base case
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = LCA2(root.left, n1, n2);
            Node rightLca = LCA2(root.right, n1, n2);

            // leftLca == val rightLca == null
            if (rightLca == null) {
                return leftLca;
            }
            if (leftLca == null) {
                return rightLca;
            }
            return root;
        }

        // Find the minimum distance between two nodes
        public int MinDistance(Node root, int n1, int n2) {
            Node lca = LCA2(root, n1, n2);
            int dist1 = lcaDist(lca, n1);
            int dist2 = lcaDist(lca, n2);

            return dist1 + dist2;
        }

        // finding lcadistance
        public int lcaDist(Node root, int n) {
            // base case
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int leftDist = lcaDist(root.left, n);
            int rightDist = lcaDist(root.right, n);

            if (leftDist == -1 && rightDist == -1) {
                return -1;
            } else if (leftDist == -1) {
                return rightDist + 1;
            } else {
                return leftDist + 1;
            }
        }

        // KthAncestors
        public int KAncestor(Node root, int n, int k) {
            // base case
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }

            int leftDist = KAncestor(root.left, n, k);
            int rightDist = KAncestor(root.right, n, k);

            int max = Math.max(leftDist, rightDist);
            if (max + 1 == k) {
                return root.data;
            }
            return max + 1;
        }

        // Transform to Sum Tree
        public int TransformTreeSum(Node root) {
            // base case
            if (root == null) {
                return 0;
            }

            int leftChild = TransformTreeSum(root.left);
            int rightChild = TransformTreeSum(root.right);

            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;

            int data = root.data;
            root.data = newLeft + leftChild + newRight + rightChild;
            return data;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        // System.out.println(root.data);

        // System.out.println("PreOrder Traversal : ");
        // bt.PreOrder(root);
        // System.out.println();

        // System.out.println("InOrder Traversal : ");
        // bt.InOrder(root);
        // System.out.println();

        // System.out.println("PostOrder Traversal : ");
        // bt.PostOrder(root);
        // System.out.println();

        // System.out.println("LevelOrder Traversal : ");
        // bt.LevelOrder(root);

        // System.out.println();
        // System.out.println("Height of binary tree is : " + bt.heightOfTree(root));

        // System.out.println();
        // System.out.println("Number of nodes in a binary tree is : " +
        // bt.CountNodes(root));

        // System.out.println();
        // System.out.println("Sum of nodes in a Binary Tree : " + bt.SumOfNodes(root));

        // System.out.println();
        // System.out.println("Diameter of a Binary Tree : " + bt.diameterofTree(root));

        // System.out.println();
        // System.out.println("Diameter of a Binary Tree : " + bt.diameter1(root).diam);

        // System.out.println();
        // System.out.println("Height of a Binary Tree : " + bt.diameter1(root).ht);

        // top view of the binary tree
        // bt.topView(root);

        // kth level iteartive approach
        // bt.KthLevelIterative(root);

        // kth level using recursion
        // bt.KthLevelRecursively(root, 1, 3);

        // lowest common ancestor 1
        // System.out.println(bt.LCA(root, 4, 6).data);

        // Lowest Common ancestor 2
        // System.out.println(bt.LCA(root, 4, 6).data);

        // minimum distance between two nodes
        // System.out.println(bt.MinDistance(root, 4, 6));

        // kth ancestorss
        // System.out.println(bt.KAncestor(root, 5, 1));

        // Transform To Sum Tree
        bt.TransformTreeSum(root);
        bt.PreOrder(root);
    }
}