package org.example.hashmapandheap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DistinctCommonElementBetweenTwoArrays {
    public static void main(String str[])
    {
        int[] a1 = {1, 1, 2, 3, 4};
        int[] a2 = {1, 2, 2, 5};

        int nums1[] = {1,2,2,1}, nums2[] = {2,2};  //Output: [2]
        int nums3[] = {4,9,5}, nums4[] = {9,4,9,8,4} ; //Output: [9,4] or Output: [4,9]


        commonElementBetweenTwoArrayWithoutDuplicate(nums3,nums4);


    }
    public static void commonElementBetweenTwoArrayWithoutDuplicate(int arr[],int arr2[])
    {
        HashMap<Integer,Integer> frequency=new HashMap<>();

        for(int a:arr)
        {
            frequency.put(a,frequency.getOrDefault(a,0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(int b:arr2)
        {
            if(frequency.containsKey(b))
            {
                result.add(b);
                frequency.remove(b);
            }
        }
        System.out.println(result);
    }
}
