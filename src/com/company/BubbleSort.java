package com.company;

import java.util.Arrays;

public class BubbleSort  {
    // Ska sortera [3,6, 65,11, 5,1] från minsta värde till högsta med hjälp av bubble sort


    public static void main(String[] args) {
        int[] arr = {3, 6, 65, 11, 5, 1};
        System.out.println("Sorted Array: " + Arrays.toString(acendingOrder(arr)) + "\n");

        BinaryTree bt = new BinaryTree();
        bt.insert(25);
        bt.insert(20);
        bt.insert(15);
        bt.insert(27);
        bt.insert(29);
        bt.insert(30);
        bt.insert(32);

        System.out.println("-------INORDER------");
        bt.printInOrder(bt.root);
        System.out.println("-------IN POSTORDER------");
        bt.printInPostOrder(bt.root);
        System.out.println("------IN PREORDER----");
        bt.printInPreOrder(bt.root);
        System.out.println("----- Reverse InOrder");
        bt.printInReverseOrder(bt.root);



        //
     /*     25          Pre Order                Traversering Pre-order (NLR) ABDEHICFG
        20    27        Post Order
      15        29      In Order
                    30
                       32  In reverseOrder
   *///

    }




    public static int[] acendingOrder(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;

    }
}

