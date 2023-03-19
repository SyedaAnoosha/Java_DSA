package Tree;

public class BinarySearchTree_Practice {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        BST.insert(5);
        BST.insert(3);
        BST.insert(6);
        BST.insert(9);
        BST.insert(10);
        BST.insert(17);
        BST.insert(16);
        BST.insert(1);
        System.out.println(BST.search(45));
        System.out.println(BST.search(1));
        BST.postOrder();
        BST.preOrder();
        BST.inOrder();
    }
}
