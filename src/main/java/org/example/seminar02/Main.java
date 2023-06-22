package org.example.seminar02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    public static void task1() {
        for (int i = 10000; i < 100000; i = i + 10000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            Date startDate = new Date();
            Bubble.sort(array);
            Date endDate = new Date();
            long bubleSortTime = endDate.getTime() - startDate.getTime();

            int[] array2 = new int[i];
            for (int j = 0; j < array2.length; j++) {
                array2[j] = (int) (Math.random() * 10000);
            }
            Date startDate2 = new Date();
            QuickSort.sort(array2, 0, array2.length - 1);
            Date endDate2 = new Date();
            long quickSortTime = endDate2.getTime() - startDate2.getTime();

            System.out.printf("i: %s, bubble sort: %s, quick sort: %s \n", i, bubleSortTime, quickSortTime);
        }
    }

    public static void task2() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(BinarySearch.search(17, array, 0, array.length - 1));
    }

}
