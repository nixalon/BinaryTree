package com.company;

import java.util.Arrays;

public class BubbleSort extends BinaryTree {
    // Ska sortera [3,6, 65,11, 5,1] från minsta värde till högsta med hjälp av bubble sort


    public static void main(String[] args) {
        int arr[] = {3, 6, 65, 11, 5, 1};
        System.out.println("Tadaaaa: " + Arrays.toString(acendingOrder(arr)) + "\n");
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



    /*public static void main(String [] args) {
        int[] a = new int[]{3,6,65,11,5,1};
        int v = a[i];
        for (int i = 0; i < a.length; i++) {
            if(i < )
        }
    }*/


