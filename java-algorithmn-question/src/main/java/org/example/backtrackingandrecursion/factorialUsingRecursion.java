package org.example.backtrackingandrecursion;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class factorialUsingRecursion {
    public static void main(String str[]) {
        factoral(5);

        //System.out.println(factoraljava8(5));

        factoraljava8(5);
    }

    public static int factoral(int n) {
        ;
        if (n == 0 || n == 1) {
            System.out.println(1);
            return 1;
        }
        int fact = n * factoral(n - 1);
        System.out.println(fact);
        return fact;
    }

    public static void factoraljava8(int n) {
        ;


        int result[]={1};

       // List<Integer> f = IntStream.rangeClosed(1, n).map(i -> result[0] *= i).boxed().collect(Collectors.toList());
        int[] ff = IntStream.rangeClosed(1, n).map(i->result[0] *=i).toArray();

       // System.out.println(f);
        System.out.println(Arrays.toString(ff));
    }
}
