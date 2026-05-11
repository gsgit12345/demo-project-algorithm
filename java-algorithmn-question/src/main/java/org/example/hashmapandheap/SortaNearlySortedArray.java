package org.example.hashmapandheap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class SortaNearlySortedArray {
    public static void main(String str[]) {
//        1-use the priority que and fill the array value upto k into priorityque
//        2-Start the second loop from k+1 and remove a element from the priorityque and
//        then add into the priorityqueuw
//        3-run the third loop on pririty que to print the remaining element

        int arr[] = {1, 2, 3, 4, 5, 6};

        int k = 2;
        int arr2[] = {3, 2, 1, 6, 5, 4};
        int arr3[] = {6, 5, 3, 2, 8, 10, 9};
        int k1 = 3;

        int arr4[] = {4, 3, 2, 1}; //if k =0 array is placed on right position
        int k2 = 0;
        sortNearlySortedArray(arr3, k1);

        java8StreamStyle(arr3, k1);
    }

    public static void sortNearlySortedArray(int arr[], int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int i = 0; i <= k; i++) {
            que.add(arr[i]);
        }

        int index = 0;
        for (int i = k + 1; i < arr.length; i++) {
            //System.out.println(que.remove();
            arr[index++] = que.remove();
            que.add(arr[i]);
        }

        while (que.size() > 0) {
            //  System.out.println(que.remove());

            arr[index++] = que.remove();
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void java8StreamStyle(int arr[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        IntStream.range(0, k + 1).forEach(i -> pq.add(arr[i]));

        int[] result = new int[arr.length];

        int index[] = {0};

        IntStream.range(k + 1, arr.length).forEach(i -> {

            result[index[0]++] = pq.remove();
            pq.add(arr[i]);
        });

        while (pq.size() > 0) {
            result[index[0]++] = pq.remove();
        }

        System.arraycopy(result, 0, arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
