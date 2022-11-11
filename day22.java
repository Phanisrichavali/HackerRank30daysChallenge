import java.io.*;
import java.util.*;
import java.util.Scanner;

class node {
    int data;
    node pLeft;
    node pRight;

    node (int data) {
        this.data = data;
        this.pLeft = null;
        this.pRight = null;
    }
}

class TREE {
    node root;

    TREE() {
        this.root = null;
    }
}

public class Solution {
    public static node insert(node tree, int data) {
        if (tree != null) {
            if (tree.data < data)
                tree.pRight = insert(tree.pRight, data);
            else {
                tree.pLeft = insert(tree.pLeft, data);
            }
            return tree;
        }
        return new node(data);
    }

    public static node input(node tree) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while ((N--) != 0) {
            int data = sc.nextInt();
            tree = insert(tree, data);
        }
        sc.close();
        return tree;
    }

    public static int getHeight(node tree) {
        if (tree == null)
            return -1;
        else
            return Math.max(getHeight(tree.pLeft), getHeight(tree.pRight)) + 1;
    }

    public static void main(String[] args) {
        TREE tree = new TREE();
        tree.root = input(tree.root);
        System.out.println(getHeight(tree.root));
    }
}
