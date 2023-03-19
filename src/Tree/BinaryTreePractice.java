package Tree;

public class BinaryTreePractice {
    public static void main(String[] args) {

        BinaryTree b1 = new BinaryTree("D");
        BinaryTree b2 = new BinaryTree("E");
        BinaryTree b3 = new BinaryTree("F");
        BinaryTree b4 = new BinaryTree("G");
        BinaryTree BTL = new BinaryTree("B",b1,b2);
        BinaryTree BTR = new BinaryTree("C",b4,b3);
        BinaryTree BT = new BinaryTree("A",BTL,BTR);
        System.out.println("Size: "+BT.size());
//        System.out.println("isFull: " + BT.isFull(BT));
//        System.out.println(BT.search("o"));
//        System.out.println(BT.numberOfLeaves());
        System.out.println(BT.postOrder());
        System.out.println(BT.preOrder());
        System.out.println(BT.inOrder());

/*
        System.out.println(BT.getRoot());
        System.out.println(BT.isLeaf());
        System.out.println(b1.isLeaf());
        System.out.println(b2.isLeaf());*/
//        System.out.println(BT);
//        System.out.println(BT.preOrder());
//        System.out.println(BT.postOrder());

    }
}
