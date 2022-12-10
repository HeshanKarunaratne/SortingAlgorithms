package DataStructuresMoshHamedani.SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{11, 9, 6, 5, 3, 18, 20, 21, 24, 30};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start >= end)
            return;

        int boundary = partition(array, start, end);
        quickSort(array, start, boundary - 1);
        quickSort(array, boundary + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;

        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot)
                swap(array, i, ++boundary);
        }
        return boundary;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
