package org.example.leetcode150question.threesum;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_ThreeSum_15 {

    public static void main(String str[]) {
//        1-find the triplet whose sum equal to 0
//        2-Sort the Array
//        3-Iterate Through First Element.start main loop from i=0 till i<arrlenth-2
//        4-Early Termination -if num[i]>0 so break because there is no negative number in array
//        Positive + Positive + Positive but 0 can be.
//        5-Skip Duplicates for First Element .we check if i > 0 and nums[i] == nums[i-1]. If true,we skip this iteration using
//        continue because we've already processed this value as the first element.
//        6-Two-Pointer Search For each valid nums[i], we initialize two pointers:
//
//          Left pointer j = i + 1 (starts right after the fixed element)
//          Right pointer k = n - 1 (starts at the end of the array)
//        7-Handle Duplicates for Two Pointers After finding a valid triplet

        int arr[] = {-1, 0, 1, 2, -1, -4};
        //ans:-[[-1, -1, 2], [-1, 0, 1]]
        int arr1[] = {1, 2, 3, 4}; //this is the all positive
        //ans= []
        int arr2[] = {-1, -2, -3, -4}; //this all negative
        //ans= []
        int arr3[] = {0, 0, 0};
        // ans=[[0, 0, 0]]
        int arr4[] = {0, 0, 0, 0, 0}; //duplicate handling
        // ans=[[0, 0, 0]]
        int arr5[] = {1, -1};
        //ans=[]
        int arr6[]={-4, -2, -1, 0, 1, 2, 4};



    }

    public List<List<Integer>> findUniqueTripletPaireEqualToZero(int arr[]) {

       // time and space complexity:- O(n²) and O(1)
        List<List<Integer>> result=new ArrayList<>();
        if(arr==null||arr.length<3)
        {
            result.add(List.of(arr[0],arr[1],arr[2]));
            return  result;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]>0) {//case where all elemnets are positive only
                break;
            }

            if(i>0&&arr[i]==arr[i-1])  //duplicate handling
                continue;

            //solve the two some using two pointers

            int left=i+1;
            int right =arr.length-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];

                if(sum<0)
                    left++;
                else if(sum>0)
                {
                    right--;
                }
                else {
                    result.add(List.of(arr[i], arr[right], arr[left]));
                    //check the duplicate of the left and right elements in array

                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }

        }

        return result;
    }
}
