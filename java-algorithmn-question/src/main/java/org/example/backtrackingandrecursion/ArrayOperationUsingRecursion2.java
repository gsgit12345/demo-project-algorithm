package org.example.backtrackingandrecursion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperationUsingRecursion2 {
    public static void main(String str[]) {
        int arr[] = {2, 1, 78, 23, 44, 11, 55, 66, 78, 89, 78, 44, 2, 1, 55, 66, 44, 23};

        System.out.println("using recursion:" + lastIndexUsingRecursionForElement(arr, 0, 66));
        int firstIndexOaelemnt = findFirstIndexOccurenceInArrayUsingJava8(arr, 0, 66);
        System.out.println(firstIndexOaelemnt);

        int lastIdx = lastIndexUsingJava8(arr, 0, 23);
        System.out.println("lastindex:;" + lastIdx);

       System.out.println( "first index using recusrsion:"+firstIndexUsingRecursionForElement(arr,0,66));
    }

    public static int findFirstIndexOccurenceInArray(int arr[], int index, int element) {
        // findFirstIndexOccurenceInArray

        int firstIndex = Arrays.stream(arr).filter(i -> arr[i++] == element).findFirst().getAsInt();
        System.out.println(firstIndex);
        return firstIndex;
    }

    public static int findFirstIndexOccurenceInArrayUsingJava8(int arr[], int index, int element) {
        int firstIndex = IntStream.range(index, arr.length).filter(i -> arr[i++] == element).findFirst().orElse(-1);
        System.out.println(firstIndex);
        return firstIndex;
    }

    public static int lastIndexUsingJava8(int arr[], int index, int element) {
        //reverse index = last index - current index-1
        int lastIndex = IntStream.range(index, arr.length).map(i -> arr.length - 1 - i).
                peek(i -> System.out.println(i)).filter(i -> arr[i] == element).
                findFirst().orElse(-1);

        return lastIndex;
    }

    public static int lastIndexUsingRecursionForElement(int arr[], int index, int element) {
        if (index == arr.length) {
            return -1;
        }
        int idx = lastIndexUsingRecursionForElement(arr, index + 1, element);
        if (idx == -1) {
            if (arr[index] == element) {
                return index;
            } else {
                return -1;
            }
        } else
            return idx;
    }

    public static int firstIndexUsingRecursionForElement(int arr[], int index, int element) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == element) {
            return index;
        } else {
            int idx = firstIndexUsingRecursionForElement(arr, index + 1, element);
            return idx;
        }
    }

}
