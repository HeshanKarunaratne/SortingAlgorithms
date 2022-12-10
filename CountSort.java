package DataStructuresMoshHamedani.SortingAlgorithms;

import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 3, 1, 1, 4, 2};
        System.out.println(Arrays.toString(array));
        countSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void countSort(int[] array) {
        if (array.length == 0) return;

        int maxValue = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > maxValue)
                maxValue = value;
        }

        int[] countArr = new int[maxValue + 1];
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]] += 1;
        }

        int pointer = 0;
        for (int i = 0; i < countArr.length; i++) {
            if(countArr[i] != 0){
                while (countArr[i] != 0){
                    array[pointer++] = i;
                    countArr[i]--;
                }
            }
        }

    }
}
