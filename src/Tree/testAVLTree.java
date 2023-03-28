package Tree;// AVL tree implementation in Java

public class testAVLTree{
  // Driver code
  public static void main(String[] args) {
    AVL tree = new AVL();
    int[] listNum={15,10,9,11};
    for(int i : listNum){
      tree.root = tree.insertNode(tree.root,i);
    }
    // tree.printTree(tree.root, "", true);
    tree.display();
  }
}