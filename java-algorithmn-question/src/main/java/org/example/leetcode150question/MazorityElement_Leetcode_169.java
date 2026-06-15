package org.example.leetcode150question;

public class MazorityElement_Leetcode_169 {
    public static void main(String str[]) {
        // this problem can be solved using moor's voting algorithm
        // using hashmap we can also solve it
        // mazority element is element if n/2 time elements occurs in the array

        int array[] = {2, 1, 1, 1, 1, 2};
        //ans=1
        System.out.println(getMazorityElement(array));
    }

    public static int getMazorityElement(int arr[]) {
        int cnt = 0;
        int candidate = 0;

        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0) {
                candidate = arr[i];
            }
            if (candidate == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }

        }
        return candidate;
    }
}
