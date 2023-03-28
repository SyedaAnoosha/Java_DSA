package Tree;
public class BinarySearchTree {
    Node root;

    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val =val;
        }
    }     // end of class Node

    public void insert(int val){
        root = insert(root, val);
    }
    public Node insert(Node root, int val){
        if (root==null){
            root = new Node(val);
            return root;
        }
        if (val<root.val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }      // end of insert

    public void search(int val){
        if(search(root, val)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public boolean search(Node root, int val){
        if (root==null){
            return false;
        }
        if(root.val == val){
            return true;
        }
        if (root.val > val){
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }
    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    public void inOrder(Node root){ //
        if (root==null){      // base condition for recursive call
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    public void postOrder(Node root){
        if (root==null){      // base condition for recursive call
            return;
        }
        System.out.print(root.val + " ");
        postOrder(root.left);
        postOrder(root.right);
    }
    public void preOrder(){
        preOrder(root);
        System.out.println();
    }

    public void preOrder(Node root){
        if (root==null){      // base condition for recursive call
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val + " ");
    }

}