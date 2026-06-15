package org.example.abdulbukhari_ds.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeapUsingHeapifyup {

    //    1-Insert
//    2-Delete  --largest element
    // Left child --2*i+1
    // right child --2*i+2
    // parent       floor((i-1)/2)
    List<Integer> heap = new ArrayList<>();

    public  List<Integer> insert(int value) {

        heap.add(value);

        int current=heap.size()-1;  // index of last inserted node

        while(current>0)
        {
            int parent=(current-1)/2;  // this is the root
            if(heap.get(parent)>heap.get(current))
                break;
            int tem=heap.get(parent);   //swapping the value and moveing greater value towards parent
            heap.set(parent,heap.get(current));
            heap.set(current,tem);

            current=parent;

        }

        return heap;

    }
    public static void main(String str[])
    {
        MaxHeapUsingHeapifyup heap=new MaxHeapUsingHeapifyup();

        int arr[]={22,11,3,2,66,44,33,67,23,43};
        List<Integer> result=null;
        for(int num:arr) {
           result= heap.insert(num);
        }
        System.out.println(result);
    }
}
