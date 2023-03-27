package Tree;

public class AVL_Tree_Practice {
    public static void main(String[] args) {
        AVLTree avl = new AVLTree(1000);
        avl.add(89);
        avl.add(65);
        avl.add(80);
        avl.add(56);
        avl.add(9);
        avl.add(8);
        avl.add(67);
        avl.add(45);
        avl.add(87);

        System.out.println(avl);

    }
}
