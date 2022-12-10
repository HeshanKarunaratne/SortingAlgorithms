package DataStructuresMoshHamedani.SortingAlgorithms;

import java.util.*;

public class BucketSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 2, 5, 4, 3, 7};
        bucketSort(array, 3);
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[]{6, 2, 5, 4, 3, 7};
        bucketSortLinkedListImpl(array2, 3);
        System.out.println(Arrays.toString(array2));
    }

    private static void bucketSortLinkedListImpl(int[] array, int bucketSize) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketSize; i++)
            buckets.add(new ArrayList<>());


        for (int item : array)
            buckets.get(item / bucketSize).add(item);

        int i = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int item : bucket)
                array[i++] = item;
        }
    }

    private static void bucketSort(int[] array, int bucketSize) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < bucketSize; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < array.length; i++) {
            List<Integer> integerList = map.get(array[i] / bucketSize);
            integerList.add(array[i]);
        }

        int pointer = 0;
        for (int i = 0; i < bucketSize; i++) {
            List<Integer> integerList = map.get(i);
            int[] arr = integerList.stream().mapToInt(t -> t).toArray();

            MergeSort.merge(arr);
            for (int j = 0; j < arr.length; j++) {
                array[pointer++] = arr[j];
            }

        }
    }

}
