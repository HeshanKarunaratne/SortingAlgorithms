package DataStructuresMoshHamedani.SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{11, 9, 6, 5, 3, 18, 20, 21, 24, 30};
        System.out.println(Arrays.toString(array));
        bubbleSortOptimized(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSortOptimized(int[] array) {

        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 1; j < array.length - i; j++) {
                System.out.println("i:" + i + " j:" + j);
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) return;
        }
    }

    private static void bubbleSortNotOptimized(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length; j++) {
                System.out.println("i:" + i + " j:" + j);
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);

                }
            }
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
