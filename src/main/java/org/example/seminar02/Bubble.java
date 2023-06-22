package org.example.seminar02;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 10, 4, 2, 1, 5, 12, 6, 3};
//        sort(arr);
        sort_x(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sort_x(int[] array) {
        boolean needSort;
        do {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = true;
                }
            }
        }
        while (needSort);
    }
}
