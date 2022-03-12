import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Preorder Inorder Postorder Traversals in One Traversal 

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class Pair{
    Node node;
    int num;
    Pair(Node node , int num){
        this.node = node;
        this.num = num;
    }
}

class Solution{
    public List<Integer> postorderTraversal(Node root){
        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root, 1));
        List <Integer> pre = new ArrayList<>();
        List <Integer> in = new ArrayList<>();
        List <Integer> post = new ArrayList<>();

        if (root == null) {
            return post;
        }

        while (!st.isEmpty()) {
            Pair it = st.pop();

            // this is the part of pre
            //incrent 1 to 2
            // push the left side of the tree
            if (it.num == 1) {
                pre.add(it.node.value);
                it.num++;
                st.push(it);

            if (it.node.left != null) {
                st.push(new Pair(it.node.left, 1));
            }
        }
        
        //this is a part of in 
        // increment 2 or 3
        // push right

        else if (it.num == 2) {
            in.add(it.node.value);
            it.num++;
            st.push(it);

            if (it.node.right != null) {
                st.push(new Pair(it.node.right, 1));
            }
        }
        
        // dont push it back again 
        else{
            post.add(it.node.value);
        }
    }
    return post;
    }
}

