package org.example.dynamicprogramming.dplevel1;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String str[]) {

        // 5 =5
        //6 ==6
        //7=13
        int n = 7;
        System.out.println(findFibonacciUsingRecursion(n));
    }

    public static int findFibonacciUsingRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
      //  Time Complexity: big O(2ⁿ) .it forms a binary tree
      //space o(n)
        int first = findFibonacciUsingRecursion(n - 1);
        int second = findFibonacciUsingRecursion(n - 2);
        int result=first + second;
        return result;

    }
    public static void findFibonacciUsingJava8(int n)
    {
        //Stream.iterate(seed, function)
       Set<Integer> setColl= Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]}).  //zgenerates an infinite stream of Fibonacci pairs
                limit(n).map(f->f[0]).collect(Collectors.toSet());
       System.out.println(setColl);

    }
    public static int findFibonacciUsingDPMemorization(int n)
    {
        return 0;
    }
}
