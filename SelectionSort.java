package DataStructuresMoshHamedani.SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{11, 9, 6, 5, 3, 18, 20, 21, 24, 30};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;

            swap(array, i, minIndex);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
