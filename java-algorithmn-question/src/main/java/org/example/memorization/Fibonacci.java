package org.example.memorization;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String str[]) {

        int result = getFibUsingRecursion(6);

        System.out.println(result);
    }

    public static int getFibUsingRecursion(int num) {

        if (num == 0 || num == 1) {
            return num;
        }
        int first = getFibUsingRecursion(num - 1);
        int second = getFibUsingRecursion(num - 2);
        return first + second;

    }

    public static List<Integer> usingJava8(int num) {

     List<Integer> fib=Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]}).
                limit(num).map(f->f[0]).collect(Collectors.toList());

        //1-new int[]{0,1}  --seed value
        //2-f->new int[]{f[1],f[0]+f[1]}  --next value
        //3-f = an entire int array (like [a, b])
        //4- [0,1] → [1,1] → [1,2] → [2,3] → [3,5]
        //5-f[0] current Fibonacci
        //6--f[1] next fibonaci
        //7-first element of each pair = Fibonacci number
        //[0,1]
        //[1,1]
        //[1,2]
        //[2,3]
        //[3,5]
        // so   //8-map(f->f[0])  extract 0,1,1,2,3
return fib;
    }

    public static int getFibUsingMemoRization(int num) {
        return 0;
    }
}
