package org.example.array.commonquest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheFirstAndSecondLargestInArray {
    public static void main(String[] str) {
        int[] arr = {1, 0, 100, 2, 3, 99, 80, 70, 67};
        //using java 8

        List<Integer> list = Arrays.stream(arr).//big(1)
                boxed(). //big(n)  --converts int into integer
                sorted((a, b) -> b - a). //big (n log n)
                collect(Collectors.toList()).subList(0, 2); //big(1)
        //big(n log n)
        System.out.print("first largest::" + list.get(0) + ":second largest:" + list.get(1));

        findFirstandsecondLargest(arr);
    }

    public static void findFirstandsecondLargest(int[] array) {
        int secondMax = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];

            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        System.out.println("first max::" + max + ":second max::" + secondMax);
    }
}
