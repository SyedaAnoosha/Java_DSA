package Tree;

public class BinaryTreePractice {
    public static void main(String[] args) {
        BinaryTree b11 = new BinaryTree(7);
        BinaryTree b21 = new BinaryTree(6);
        BinaryTree b31 = new BinaryTree(5);
        BinaryTree b41 = new BinaryTree(4);
        BinaryTree BTL1 = new BinaryTree(3,b11,b21);
        BinaryTree BTR1 = new BinaryTree(2,b41,b31);
        BinaryTree BT1 = new BinaryTree(1,BTL1,BTR1);

        System.out.println(BT1.isFull());
        System.out.println(BT1.numberOfLeaves());
        System.out.println(BT1.preOrder()+" ; "+BT1.inOrder()+" ; "+BT1.postOrder());;

        System.out.println(BT1.sumOfNodes());
        BT1.levelOrder();
//        BinaryTree b1 = new BinaryTree("D");
//        BinaryTree b2 = new BinaryTree("E");
//        BinaryTree b3 = new BinaryTree("F");
//        BinaryTree b4 = new BinaryTree("G");
//        BinaryTree BTL = new BinaryTree("B",b1,b2);
//        BinaryTree BTR = new BinaryTree("C",b4,b3);
//        BinaryTree BT = new BinaryTree("A",BTL,BTR);
//        System.out.println("Size: "+BT.size());
//        System.out.println(BT.search("N"));
//        System.out.println(BT.postOrder());
//        System.out.println(BT.preOrder());
//        System.out.println(BT.inOrder());
//        BT.levelOrder();

    }
}
