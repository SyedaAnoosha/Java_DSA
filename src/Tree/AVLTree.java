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
        height = 1 + Math.max(left.height,right.height);
    }

    public static final AVLTree NIL = new AVLTree();

    public AVLTree(int key){
        this.key = key;
        left = right = NIL;
    }

    public int size(){
        if(this == NIL){
            return 0;
        }
        return 1 + left.size() + right.size();
    }

    public boolean add(int key){
        int oldSize = size();
        grow(key); // No need to make another object, the same tree is growing
        return (size() > oldSize);
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
        height = 1 + Math.max(left.height,right.height);
        return this;
    }

    private void reBalance() {

        if(right.height > left.height + 1){ // simple rotate
            if(right.left.height > right.right.height) {  //compound rotate
                right.rotateRight();
            }
            rotateLeft();
        }

        if (left.height > right.height + 1){
            if(left.right.height > left.left.height) {
                left.rotateLeft();
            }
            rotateRight();
        }
    }

    public String toString() {
        if (this == NIL) return "";
        return left.toString() + " " + key + " " + right.toString();
    }

    private void rotateLeft(){
        left = new AVLTree(key, left, right.left);
        key = right.key;
        right = right.right;
    }

    private void rotateRight(){
        right = new AVLTree(key,left.right,right);
        key = left.key;
        left = left.left;
    }

}