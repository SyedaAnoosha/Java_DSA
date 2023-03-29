package Tree;

public class BinarySearchTree_Practice {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        BST.insert(14);
        BST.insert(17);
        BST.insert(11);
        BST.insert(7);
        BST.insert(53);
        BST.insert(4);
        BST.insert(13);
        BST.insert(12);
        BST.insert(8);
        BST.insert(60);
        BST.insert(19);
        BST.insert(16);
        BST.insert(20);

        BST.search(1);
        BST.search(89);

        BST.inOrder();
        BST.delete(8);
        BST.inOrder();
        BST.delete(7);
        BST.inOrder();
        BST.delete(11);
        BST.inOrder();
        BST.delete(14);
        BST.inOrder();
        BST.delete(17);
        BST.inOrder();



    }
}
