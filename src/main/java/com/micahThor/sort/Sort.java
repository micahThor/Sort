package com.micahThor.sort;

import java.util.Arrays;

public class Sort {

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void mergeSort(int[] array) {

        int arrayLength = array.length;

        if (arrayLength > 1) {

            int mid = arrayLength / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, arrayLength);

            Sort.mergeSort(left);
            Sort.mergeSort(right);

            Sort.merge(left, right, array);
        }
    }

    public static void merge(int[] left, int[] right, int[] array) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }


        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }


    }
}