package home.amit.java.algorithm.common;

public class BinaryTree {

    public BTreeNode getBTree() {
        BTreeNode bTreeNode = new BTreeNode(10);
        bTreeNode.left = new BTreeNode(9);
        bTreeNode.right = new BTreeNode(11);
        bTreeNode.left.left = new BTreeNode(7);
        bTreeNode.left.right = new BTreeNode(8);
        bTreeNode.right.left = new BTreeNode(4);
        bTreeNode.right.right = new BTreeNode(5);
        bTreeNode.right.right.left = new BTreeNode(3);
        bTreeNode.right.right.right = new BTreeNode(6);
        bTreeNode.right.right.right.left = new BTreeNode(60);
        return bTreeNode;
//
//               10
//          9            11
//      7      8      4       5
//                        3        6


    }

}
