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

    public static void quickSort(int[] array, int left, int right) {

        if (left < right) {
            int position = Sort.partition(array, left, right);
            Sort.quickSort(array, left, position - 1);
            Sort.quickSort(array, position + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {

        int pivot = array[right];
        int low = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                low++;
                Sort.swap(array, j, low);
            }
        }
        Sort.swap(array, right, low + 1);
        return low + 1;
    }

    public static void swap(int[] array, int i, int low) {
        int temp;
        temp = array[i];
        array[i] = array[low];
        array[low] = temp;
    }
}