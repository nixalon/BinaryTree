package com.company;

public class BinaryTree {
    Node root;

    static class Node{
        Node left;
        Node right;
        int key;                        //Värde av noden

        public void setKey() {
            this.key = key;
        }
        public void setLeft(Node left) {
            this.left = left;
        }
        public void setRight(Node right) {
            this.right = right;
        }
        public int getKey() {
            return key;
        }
        public Node getRight(){
            return right;
        }
        public Node getLeft(){
            return left;
        }
        public Node(int key) {
            this.key = key;
        }
    }

    public void printTreeInOrder() {
        printTreeInOrder(root);
    }

    private void printTreeInOrder(Node tree){
        if(tree == null){
            return;
        }
        printTreeInOrder(tree.left);
        System.out.println(tree.key);
        printTreeInOrder(tree.right);
    }

    public void printTreeInReverseOrder(){
        printTreeInReverseOrder(root);
    }

    private void printTreeInReverseOrder(Node tree) {
        if(tree == null){
            return;
        }
        printTreeInReverseOrder(tree.right);
        System.out.println(tree.key);
        printTreeInReverseOrder(tree.left);
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    private Node insertRec(Node tree, int key) {
        if(tree == null){
            tree = new Node(key);
            return tree;
        }
        if(key < tree.key){
            tree.left = insertRec(tree.left, key);
        }
        else if (key > tree.key){
            tree.right = insertRec(tree.right, key);
        }
        return tree;
    }

    public static void main(String [] Args){
        BinaryTree bt = new BinaryTree();

        bt.insert(8);
        bt.insert(3);
        bt.insert(10);
        bt.insert(1);
        bt.insert(6);
        bt.insert(13);

        bt.printTreeInReverseOrder();
        bt.remove(1);
        System.out.println("----------------");
        bt.printTreeInOrder();

    }

    private void remove(int key){
        root = remove(root, key);
    }

    public Node remove(Node tree, int key){
        if(tree == null){
            return null;
        }
        if(key == tree.key){                                    //Om värdet man vill ta bort matchar med ett i trädet...
            if(tree.left == null && tree.right == null){        //Om trädet inte har några barn (aka är ett löv)
                return null;
            }
            else if (tree.left == null) {                       //eller om det finns siffror åt höger
                return tree.right;                              //Fortsätt till höger.
            }
            else if (tree.right == null){                       //eller om det finns noder åt vänster
                return tree.left;                               //Fortsätt till vänster.
            }
            else {
                int minValue = minValue(root.getRight());
                root.setKey(minValue);
                root.setRight(deleteNode(root.getRight(), minValue));
            }
        }
        if (key < tree.key){
            tree.left = remove(tree.left, key);
            return tree;
        }
        else if(key > tree.key){
            tree.right = remove(tree.right, key);
            return tree;
        }
        return tree;
    }

    private int minValue(Node right) {
        if(Node.getLeft() != null) {
            return minValue(Node.getLeft());
        }
        return Node.getKey();
    }
}