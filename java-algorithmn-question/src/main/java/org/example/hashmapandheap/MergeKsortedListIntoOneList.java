package org.example.hashmapandheap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeKsortedListIntoOneList {
    public static void main(String str[]) {
        List<int[]> ar = Arrays.asList(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12, 13});
        List<Integer> combine = ar.stream().flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());

        System.out.println(combine);
    }
}
