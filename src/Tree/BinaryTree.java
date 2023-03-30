package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        return this.left == null && this.right == null;
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

    public String inOrder() {

        StringBuilder buf = new StringBuilder();
        if(this.left != null){
            buf.append(left.inOrder()+",");
        }
        buf.append(this.root);
        if(this.right != null){
            buf.append(","+right.inOrder());
        }
        return buf+"";

    }

    public void levelOrder() {

        if (this.root == null) {
            return;
        }
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            BinaryTree current = queue.remove();
            System.out.print(current.getRoot() + " ");
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
    }

    public int size() { // number of nodes
        int size = 1;
        if (root == null) {
            return 0;
        }
        if (left != null) {
            size += left.size();
        }
        if (right != null) {
            size += right.size();
        }
        return size;
    }
    public int sumOfNodes(){
        int sum = (Integer) this.root;
        if (left != null) {
            sum += left.sumOfNodes();
        }
        if (right != null) {
            sum += right.sumOfNodes();
        }
        return sum;
    }

    public int height() {
        if (root == null) {
            return -1;
        }
        if (this.left == null && this.right == null) {
            return 0;
        }
        int leftSubTree = 1, rightSubTree = 1;
        if (left != null) {
            leftSubTree += left.height();
        }
        if (right != null) {
            rightSubTree += right.height();
        }
        return Math.max(leftSubTree, rightSubTree);
    }


    public boolean search (Object obj){
        if(root ==  null){
            return false;
        }
        if(root.equals(obj)){
            return true;
        }
        if(left != null){
            left.search(obj);
        }
        if(right != null){
            right.search(obj);
        }
        return false;
    }
    public boolean isFull(){
        int sizeB = ((int) Math.pow(2, this.height() + 1)) - 1;
        return sizeB == this.size();
    }

    public int numberOfLeaves(){
        if(this.root == null) return 0;
        if(isFull()){
            return (int) Math.pow(2, this.height());
        }
        System.out.println("Tree is not full");
        return -1;
    }
}