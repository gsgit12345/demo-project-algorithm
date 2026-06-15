package org.example.abdulbukhari_ds.heap;

public class MaxHeapHeapifyDown {
    public  static void main(String str[])
    {
        int arr[]={22,11,34,54,1,3,2,66,432};
    }
    public void heapify(int arr[],int len,int lastRoot)
    {

    }
    public void buildMaxHeap(int arr[])
    {
        int i=arr.length;

        int lastNonleaf=(i-1)/2;

        for(int k=lastNonleaf;k>0;k--)
        {
            heapify(arr,i,k);
        }

    }
}
