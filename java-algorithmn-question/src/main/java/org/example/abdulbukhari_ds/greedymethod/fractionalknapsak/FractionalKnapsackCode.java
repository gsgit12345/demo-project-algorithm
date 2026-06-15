package org.example.abdulbukhari_ds.greedymethod.fractionalknapsak;

import java.util.Arrays;

public class FractionalKnapsackCode {
    public static void main(String str[]) {
//        1-take the twod array with value and weight and first index weight and second index value
//        2-Sort the array value/weight ratio in ascending order
//        3-Run a for loop on array
//        4-Take the weight value on index 0 from array
//        5-Take the value from array on index 1
//        6-put a if condition and check capacity is >= weight
//        7-if condition satisfy update the profit like profit+=value
//        8-subtract the weight from capacity and update the capacity with newer value
//        9-other wise go to the else block and calculate the fration like value/weight
//        10 - update the profit like profit=profit+ratio*value
//        11-break the loop and return the profit

        int weightvalue[][] = {
                {10, 60},
                {20, 100},
                {5, 50}
        };
        int capacity = 20;

        double max_profit = fractionalKnapsackCode(weightvalue, capacity);

        System.out.println(max_profit);  //135
    }

    public static double fractionalKnapsackCode(int arr[][], int capacity) {

        double profit = 0;

        Arrays.sort(arr, (a, b) -> Double.compare(
                        (double) b[1] / b[0],
                        (double) a[1] / a[0]

                )

        );

        System.out.println(Arrays.toString(arr));

        for (int item[] : arr) {
            int weight = item[0];
            int value = item[1];
//take full item and not fractional
            if (weight <= capacity) {
                profit = profit + value;
                capacity = capacity - weight;
            } else {
                //take the fractional item to maximize profit

                double ratio = (double) value / weight;

                profit = profit + capacity * ratio;
            }
        }

        return profit;
    }
}
