package org.example.backtrackingandrecursion;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class calculatepower {
    public static void main(String str[]) {
        int n = 3;
        int pow = 4;
        System.out.println(calcualtePowerRecursive(n, pow));
    }

    public static int calcualtePowerRecursive(int n, int pow) {
        if (n == 0 || pow == 0)
            return 1;
        int res = calcualtePowerJava8(n, pow - 1);
        int result = res * n;

        return result;
    }

    public static int calcualtePowerIterative(int n, int pow) {

        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * n;
        }

        return result;
    }

    public static int calcualtePowerJava8(int n, int pow) {
        int result[]={1};

      return  IntStream.rangeClosed(1,pow).map(i->result[0]*=n).peek(k->System.out.println(k)).reduce(1,(a,b)->(a*n));

          //IntStream.rangeClosed(1,pow).map(i->result[0]*=n).boxed().collect(Collectors.toList());

    }
}
