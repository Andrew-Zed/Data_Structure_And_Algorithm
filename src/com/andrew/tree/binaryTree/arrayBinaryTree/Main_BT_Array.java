package com.andrew.tree.binaryTree.arrayBinaryTree;

class Main_BT_Array {
    public static void main(String[] args) {
        BinaryTree newBinaryTree = new BinaryTree(9);
        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        newBinaryTree.insert("N7");
        newBinaryTree.insert("N8");
        newBinaryTree.insert("N9");

        System.out.println("======PreOrder Traversal======");
        newBinaryTree.preOrder(1);
        System.out.println();
        System.out.println("======InOrder Traversal======");
        newBinaryTree.inOrder(1);
    }
}
