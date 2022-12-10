package DataStructuresMoshHamedani.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 1, 4, 2};
        System.out.println(Arrays.toString(array));
        merge(array);
        System.out.println(Arrays.toString(array));
    }

    public static void merge(int[] array) {
        if (array.length == 1) return;

        int middle = array.length / 2;

        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        int[] right = new int[array.length - middle];
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        merge(left);
        merge(right);

        merge(left, right, array);
    }

    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
        
    }
}
