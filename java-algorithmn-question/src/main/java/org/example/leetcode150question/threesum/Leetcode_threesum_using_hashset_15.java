package org.example.leetcode150question.threesum;

import java.util.*;

public class Leetcode_threesum_using_hashset_15 {
    public static void main(String str[])
    {
        //leet code 15 using the hashset

    }
    public static List<List<Integer>> LeetCode15_UsingHashset(int arr[])
    {
        List<List<Integer>> result =new ArrayList<>();
        Set<Integer> container=new HashSet<>();

        if(arr==null||arr.length<3) {
            result.add(List.of(arr[0],arr[1],arr[2]));
            return result;
        }

        Arrays.sort(arr);





    }
}
