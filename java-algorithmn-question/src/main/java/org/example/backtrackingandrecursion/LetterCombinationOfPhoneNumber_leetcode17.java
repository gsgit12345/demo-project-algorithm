package org.example.backtrackingandrecursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LetterCombinationOfPhoneNumber_leetcode17 {
    final static String[] digitToLetters = {"", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String str[]) {
//                Subsets
//                 Permutations
//                 Combination Sum
//                  Generate Parentheses

        // System.out.println(getKeyPadLetterCombinationIterativeApproach("210"));
        //[ad, ae, af, bd, be, bf, cd, ce, cf]
        String ans = "";
        printKeyPadCombination("23", ans);

        List<String> re = getKeyPadLetterCombinationRecursiveApproach("23");
        // System.out.println(re);

    }

    public static List<String> getKeyPadLetterCombinationRecursiveApproach(String digit) {

        if (digit.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = digit.charAt(0);
        String remain = digit.substring(1);

        List<String> returnans = getKeyPadLetterCombinationRecursiveApproach(remain);

        List<String> answer = new ArrayList<>();

        String codeFordidgit = digitToLetters[ch - '0'];

        for (int i = 0; i < codeFordidgit.length(); i++) {
            char c = codeFordidgit.charAt(i);
            for (String cc : returnans) {
                answer.add(c + "" + cc);
            }
        }
        return answer;
    }

    public static List<String> getKeyPadLetterCombinationIterativeApproach(String digit) {
        List<String> result = new ArrayList<>();
        result.add("");
        if (digit == null || digit.isEmpty()) {
            return result;
        }
        for (char code : digit.toCharArray()) {
            String perdigit = digitToLetters[code - '0'];
            List<String> temp = new ArrayList<>();
            if (perdigit.isEmpty())
                return new ArrayList<>();
            for (String pre : result) {
                for (char c : perdigit.toCharArray()) {
                    temp.add(c + "" + pre);
                }
            }
            result = temp;
        }
        return result;
    }

    public static void printKeyPadCombination(String digit, String ans) {
        if (digit.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = digit.charAt(0);
        String remaining = digit.substring(1);

        String code = digitToLetters[ch - '0'];

        for (char cc : code.toCharArray()) {
            //ans=ans+""+cc;
            printKeyPadCombination(remaining, ans + cc);

        }
    }

    public static List<String> keyPadCombinationUsingJava8(String key) {
return null;
    }

    public static List<String> getKeyPadLetterCombination(String digit) {

        // Step 1: handle edge case
        if (digit == null || digit.isEmpty()) {
            return Collections.singletonList("");
        }

        // Step 2: convert digits → corresponding letter strings
        List<String> digitLetters = digit.chars()
                .mapToObj(c -> digitToLetters[c - '0'])
                .collect(Collectors.toList());

        // Step 3: initial value
        ArrayList<String> initial = new ArrayList<>();
        initial.add("");

        // Step 4: reduce using helper method
        List<String> result = digitLetters.stream()
                .reduce(
                        initial,
                        (prev, letters) -> expand(prev, letters),
                        (left, right) -> left
                );

        return result;
    }

    // 🔥 Helper method (core logic)
    private static ArrayList<String> expand(ArrayList<String> prev, String letters) {

        ArrayList<String> result=(ArrayList<String>) prev.stream()
                .flatMap(p ->
                        letters.chars()
                                .mapToObj(ch -> p + (char) ch)
                )
                .collect(Collectors.toList());
        return  result;
    }


}
