package org.example.lecture02;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5};
//        SimpleSort.bubbleSort(array);
//        SimpleSort.directSort(array);
//        SimpleSort.insertSort(array);
//        QuickSort.sort(array, 0, array.length - 1);
        HeapSort.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // Для бинарного поиска нужен отсортированный массив!!!
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(SimpleFind.find(array2, 5));
        System.out.println(SimpleFind.binarySearch(array2, 5));
    }
}
