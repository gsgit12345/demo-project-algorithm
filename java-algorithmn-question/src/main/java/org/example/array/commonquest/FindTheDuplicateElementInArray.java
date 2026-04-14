package org.example.array.commonquest;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheDuplicateElementInArray {
    public static void main(String str[]) {
        int arr[] = {2, 3, 4, 5, 6, 6, 5, 2, 3};
        Set<Integer> hashset = new HashSet<>();

        //time-big(n)  and space O(n)
        Set<Integer> res = Arrays.stream(arr).filter(i -> !hashset.add(i)).boxed().
                collect(Collectors.toSet());

        System.out.println("hashset::" + hashset + ":" + res);

        usingSetFindDuplicate(arr);
    }

    public static void usingSetFindDuplicate(int arr[]) {

        //time:-big(n) and space-O(n)

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int v : arr) {
            if (!seen.add(v)) {
                duplicate.add(v);
            }
        }
        System.out.print("duplicat::" + duplicate + ":seen:" + seen);

    }

    public static void usingAlteringTheOriginalArray(int array[]) {

        //time(n)  and space complexity o(k) where k total number of duplicate

        List<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int index = Math.abs(array[i]) - 1;
            if (array[index] < 0) {
                duplicate.add(Math.abs(array[index]));
            } else {
                array[index] = -array[index];
            }
        }
    }
}
