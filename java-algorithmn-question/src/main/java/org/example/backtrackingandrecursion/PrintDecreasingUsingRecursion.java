package org.example.backtrackingandrecursion;

import java.util.stream.IntStream;

public class PrintDecreasingUsingRecursion {
    public static void main(String str[])
    {
        printDecreasingAndIncreasing(9);

        System.out.println("java 8 style");

        java8Style(9);
    }

    public static void printDecreasingAndIncreasing(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printDecreasingAndIncreasing(n-1);
        System.out.println(n);

    }
    public static void java8Style(int n)
    {
        IntStream.iterate(n,i->i-1).limit(n).forEach(System.out::print);  //decreasing

        IntStream.range(0,n+1).forEach(System.out::println);

        IntStream.rangeClosed(1,n).forEach(System.out::println);


    }
}
