package org.example.lecture02;

public class SimpleFind {

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[]array, int value){
        return binarySearch(array, value, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int value, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else midPoint = (max - min) / 2 + min;
        if (array[midPoint] < value) {
            return binarySearch(array, value, midPoint + 1, max);
        } else if (array[midPoint] > value) {
            return binarySearch(array, value, min, midPoint - 1);
        } else {
            return midPoint;
        }
    }
}
