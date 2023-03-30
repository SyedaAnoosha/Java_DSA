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
    private Node insert(Node root, int val){
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
        search(root, val);
    }
    private boolean search(Node root, int val){
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

    public void delete(int val) {
        root = delete(root, val);
    }

    private Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }

        //searching node
        if (val < root.val) {
            root.left = delete(root.left, val);
        } else if (val > root.val) {
            root.right = delete(root.right, val);
        }

        //delete the node
        else {
            //case 1 with no child
          if (root.left == null && root.right == null ){
              return null;
          }

          if (root.left == null) {
              root.right = delete(root.right, val);
          } else if (root.right == null) {
              root.left = delete(root.left, val);
          }

          Node temp = findMin(root.right);
          root.val = temp.val;
          root.right = delete(root.right, temp.val);
        }

        return root;
    }

    //find inOrder Successor
    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node root){ //
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

    private void postOrder(Node root){
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

    private void preOrder(Node root){
        if (root==null){      // base condition for recursive call
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val + " ");
    }

}