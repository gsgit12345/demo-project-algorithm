package org.example.leetcode150question.leetcodeeasy;

import java.util.Arrays;

public class FindTheMinimumAndMaximumInArray {
    public static void main(String str[])
    {

        int arr[]={2,1,5,4,8,9,0,-1};

        int result[]=findTheMinMaxInArray(arr);
        System.out.println("result of min and max:"+ Arrays.toString(result));
    }
    public static int[] findTheMinMaxInArray(int array[])
    {
        if(array.length==0)
            return array;
        int min=array[0];
        int max=array[0];

        for(int i=1;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return new int[]{min,max};
    }
}
