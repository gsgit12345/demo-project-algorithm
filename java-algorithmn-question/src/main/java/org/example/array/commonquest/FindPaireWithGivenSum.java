package org.example.array.commonquest;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class FindPaireWithGivenSum {
    public static void main(String str[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int pair = 7;
        findPaireWithNaiveApproach(arr, pair);

        findPaireUsingJava8(arr,pair);
    }

    public static void findPaireWithNaiveApproach(int arr[], int paire) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == paire) {
                    System.out.println("paire num is::" + arr[i] + ":" + arr[j] + ":" + paire);
                }
            }
        }
    }

    public static void findPaireUsingJava8(int arr[], int paire) {
        Set<Integer> seen = new HashSet<>();
        IntStream.of(arr).forEach(number -> {
            int complement = paire - number;
            if (seen.contains(complement)) {
                System.out.print("paire is found {"+  complement + "," + number+"}");
            }
            seen.add(number);
        });
    }
}
