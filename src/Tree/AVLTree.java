package Tree;

public class AVLTree {
    public int key, height;
    private AVLTree left, right;
    private AVLTree(){
        left = right = this;
        height = -1;
    }

    public AVLTree(int key, AVLTree left, AVLTree right) {
        this.key = key;
        this.left = left;
        this.right = right;
        height = 1+ Math.max(left.height,right.height);
    }

    public static final AVLTree NIL = new AVLTree();

    public AVLTree(int key){
        this.key = key;
        left = right = NIL;
    }

    public boolean add(int key){
        int oldSize = size();
        grow(key); // No need to make another object, the same tree is growing
        return size() > oldSize;
    }

    private AVLTree grow(int key) {
        if(this == NIL) return new AVLTree(key);
        if(key == this.key){
            return this;
        }
        if(key < this.key){
            left = left.grow(key);
        }
        else {
            right = right.grow(key);
        }
        reBalance();
        height = 1+ Math.max(left.height,right.height);
        return this;
    }

    private void reBalance() {
        if(right.height > left.height+1){ // simple rotate
            if(right.left.height > right.right.height) {  //compound rotate
                right.rotateRight();
            }
            rotateLeft();
        }
        if (left.height > right.height+1){
            if(left.right.height > left.left.height) {
                left.rotateLeft();
            }
            rotateRight();
        }
    }

    public int size(){
        if(this == NIL) return 0;
        return 1+ left.size() + right.size();
    }

    public String toString() {
        if (this == NIL) return "";
        return left.toString() + " " + key + " " + right.toString();
    }
    private void rotateLeft(){
        left = new AVLTree(key,left,right.left);
        key = right.key;
        right = right.right;
    }

    private void rotateRight(){
        right = new AVLTree(key,left.right,right);
        key = left.key;
        left = left.left;
    }

}


/*
class AVLTree{
    private int height,key;
    Object root;
    private AVLTree left,right;
    private AVLTree(){
        left=right=this;
        height=-1;
    }
    private AVLTree(int key,AVLTree left,AVLTree right){
        this.key=key;
        this.left=left;
        this.right=right;
        height=1+Math.max(left.height,right.height);
    }
    public int size(){
        if (this==Nil)return  0;
        return 1+left.size()+ right.size();
    }
    public static final AVLTree Nil=new AVLTree();
    public AVLTree(int key){
        this.key =key;
        left=right=Nil;
    }
    public boolean add(int key){//if key already exists then it will return false
        int oldSize=size();
        grow(key);
        return size()>oldSize;
    }
    public AVLTree grow(int key){
        if (this==Nil)return new AVLTree(key);
        if (key==this.key)return this;
        if (key<this.key)left=left.grow(key);
        else right=right.grow(key);
        rebalance();
        height=1+Math.max(left.height,right.height);
        return this;
    }
    public String tostring(){
        if (this==Nil)return " ";
        return left+" "+key+" "+right;
    }
    private void rebalance(){
        if(right.height> left.height+1) {
            if (right.left.height>right.right.height){
                right.rotateRight();
                rotateLeft();
            }
        }
        if (left.height>right.height+1){
            if(left.right.height>left.left.height){
                left.rotateLeft();
                rotateRight();
            }
        }
    }
    private void rotateLeft(){
        left=new AVLTree(key,left,right.left);
        key= right.key;
        right=right.right;
    }
    private void rotateRight(){
        right=new AVLTree(key,left.right,right);
        key=left.key;
        left=left.left;
    }
}//H.w2000,1000,3000,1500,1750,25,1900,3100,2350,1200,2
public class Abl {
    public static void main(String[] args) {
       AVLTree a1=new AVLTree(2);
    }
}//H.W find the left most node of tree,Find the right most node,
 */
