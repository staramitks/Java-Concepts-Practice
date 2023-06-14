package home.amit.java.algorithm.tree;

import home.amit.java.algorithm.common.BTreeNode;
import home.amit.java.algorithm.common.BinaryTree;

public class HeightOfBTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTreeNode btree = binaryTree.getBTree();
        HeightOfBTree heightOfBTree = new HeightOfBTree();
        int height = heightOfBTree.getHeight(btree);
        System.out.println(("Height is " + height));
    }

    private int getHeight(BTreeNode btree) {


        if (btree == null) {
            return 0;
        }

        int height = 1 + Integer.max(getHeight(btree.left), getHeight(btree.right));
        return height;


    }
}
