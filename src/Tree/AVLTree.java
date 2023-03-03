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
        //rebalance();
        height = 1+ Math.max(left.height,right.height);
        return this;
    }

    public int size(){
        if(this == NIL) return 0;
        return 1+ left.size() + right.size();
    }

    public String toString() {
        if (this == NIL) return "";
        return left.toString() + " " + key + " " + right.toString();
    }

}
