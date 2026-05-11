package org.example.hashmapandheap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInArray_leetcode215 {
    // https://leetcode.com/problems/kth-largest-element-in-an-array/
    public static void main(String str[]) {
        int nums[] = {3, 2, 1, 5, 6, 4}, k = 2;
        int nums1[] = {3, 2, 3, 1, 2, 4, 5, 5, 6}, k1 = 4;

        int kth = kthLargestElement(nums, k);
        System.out.println(kth);

        System.out.println(jdk8version(nums1,k1));
    }

    public static int kthLargestElement(int[] arr, int k) {
        // time- O(n log k)  space- log(k)
        PriorityQueue<Integer> heap = new PriorityQueue<>();//min heap
        for (int a : arr) {
            heap.add(a);
            if (heap.size() > k) {
                heap.remove();
            }
        }
        return heap.peek();
    }

    public static int jdk8version(int arr[],int k)
    {
        PriorityQueue<Integer> q=new PriorityQueue();
        Arrays.stream(arr).forEach( l-> {
            q.offer(l);
            if(q.size()>k)
            {
                q.remove();// remove the smallest from the queue
            }


        });
        return q.peek();
    }
}
