package org.example.abdulbukhari_ds.binarysearch;

public class FindTheDuplicateNumberInArray_Leetcode_287 {
    public static void main(String str[]) {
//        1-we can find the single duplicate number in array using floyd cyclic detection concept
//        2-Using this approach you can find the cycle in linked list
//        3-first two variable slow and fast and initialise with the first element of array
//        4-run a do     while loop and check condition that slow !-fast and reassign value of array in slow and fast
//        5-initialise slow again after loop and with elemnet of first position of array
//        6-run the normal loop and check slow != fast and reassign value of array in slow and fast

        int arr[] = {1, 2, 3, 4, 5, 3};

        int d = findSingleDuplicateUsingFloydDetection(arr);
        System.out.println(d);

    }


    public static int findSingleDuplicateUsingFloydDetection(int arr[]) {
//        time:- big(n)
//        space:-big(1)
//this algorithm can be used to detect cycle in linked list
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static int findSingleDuplicateUsingBinarySearchAlgo(int arr[]) {
//        time :- big(logn)
//        time:-big(1)

//        note:- we will iterate array from 1 becasue we concept is applicable with n+1

return 0;
    }
}
