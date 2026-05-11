package org.example.backtrackingandrecursion;

import java.util.Arrays;

public class CyclicSortAlgorithm {
    public static void main(String str[]) {
//        Find missing number
//        Find duplicate number
//        Find all missing numbers
//        Find smallest missing positive

////        below condition should be satisfy in cyclic sort
////        Numbers are 1 → n
//        No duplicates (basic version)
        int[] arr = {3, 1, 5, 4, 2};
        int arr2[] = {2, 6, 4, 3, 1, 5};

      int arrre[]=  cyclicSort(arr);
      System.out.println(Arrays.toString(arrre));
    }

    public static int[] cyclicSort(int arr[]) {
//        1-start a loop from 0 to lengthofarray on array
//        2-take the previous index in array like arr[i]-1
//        3-check the value in array like arr[i]!arr[i]-1
//        4-if not equal please swap the value else increment the i .we no need to increment i always if there
//        is no math then we have to increment the i
//        5-return the array

        for (int i = 0; i < arr.length; ) {
            int prevIdx = arr[i] - 1;
            if (arr[i] != arr[prevIdx]) {
                swap(arr, i, prevIdx);
            } else {
                i++;
            }
        }
        return arr;
    }
    public static void swap(int arr[],int i,int j)
    {
       int temp=arr[j];
       arr[j]=arr[i];
       arr[i]=temp;
    }
}
