package com.company;

public class Node {
    Node left;
    Node right;
    int key;

    public Node (int key) {
        this.key = key;
    }

    public void insert(int key) {
        if (this.key == key) {
            return;
        }

        if (key < this.key) {

            if (left == null) {
                left = new Node(key);
            } else {
                left.insert(key);
            }
        } else {
            if (right == null) {
                right = new Node(key);
            } else {
                right.insert(key);
            }
        }
    }

    public void setData(int key) {
        this.key = key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int minValue() {
        if (left == null) {
            return key;
        } else {
            return left.minValue();
        }
    }
}