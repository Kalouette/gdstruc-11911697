package com.Trees;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(-4);
        tree.insert(1437);
        tree.insert(41556);
        tree.insert(-1564);

        tree.getMin();
        tree.getMax();
        tree.traverseInOrderDescending();
    }
}
