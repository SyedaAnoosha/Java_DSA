package Tree;

import java.util.ArrayList;

public class BinaryTree {
    Object root;
    BinaryTree left, right;


    public BinaryTree(Object root) {
        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public Object getRoot() {
        return root;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public boolean isLeaf(){
        if(this.left == null && this.right == null){
            return true;
        }
        return false;
    }

    public String preOrder(){
        StringBuilder buf = new StringBuilder();
        buf.append(this.root);
        if(this.left != null){
            buf.append(","+left.preOrder());
        }
        if(this.right != null){
            buf.append(","+right.preOrder());
        }
        return buf+"";
    }

    public String postOrder(){
        StringBuilder buf = new StringBuilder();

        if(this.left != null){
            buf.append(left.postOrder()+",");
        }
        if(this.right != null){
            buf.append(right.postOrder()+",");
        }
        buf.append(this.root);
        return buf+"";
    }

    public String toString() {
        //inorder
        StringBuilder buf = new StringBuilder();
        if(this.left != null){
            buf.append(this.left+",");
        }
        buf.append(this.root);
        if(this.right != null){
            buf.append(","+this.right);
        }
        return buf+"";

    }

    public int size(BinaryTree B){
        if(B.root == null) return 0;
        if(B.left != null && B.right != null){
            return (size(B.left) + size(B.right) + 1);
        } else if (B.left != null) {
            return size(B.left) + 1;

        } else if (B.right != null) {
            return size(B.right) + 1;
        }
        return 1;
    }


    public int height(){
        if(root == null){
            return -1;
        }
        if(this.left == null && this.right == null){
            return 0;
        }
        int leftB = 0, rightB = 0;
        if(left != null){
            leftB = 1 + left.height();
        }
        if(right != null){
            rightB = 1 + right.height();
        }
        return Math.max(leftB, rightB);
    }
    
    //search
    public boolean search (Object obj){
        String store = this.toString();
        for (int i = 0; i < store.length() ; i++) {
            if(store == obj){
                return true;
            }
        }

        return false;

    }
    public boolean isFull(BinaryTree root){
        int sizeB = ((int) Math.pow(2, root.height() + 1)) - 1;
        return sizeB == root.size(root);
    }

    public int leaves(){
        if(this.root == null) return 0;
        if(isFull(this)){
            int leaf = (int) Math.pow(2,this.height());
            return leaf;
        }
        System.out.println("Tree is not full");
        return -1;
    }
}

