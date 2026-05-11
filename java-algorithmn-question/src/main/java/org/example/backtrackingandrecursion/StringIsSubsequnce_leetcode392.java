package org.example.backtrackingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class StringIsSubsequnce_leetcode392 {
    public static void main(String str[]) {
        String st = "abc";

        List<String> result = getAllSubsequnce(st);
        System.out.println(result);
        String res = "";
        List<String> result2 = generateSubsequenceAndPrint(st, res);
        System.out.println(result2);

        System.out.println("iterative:" + getSubsequnce(st));

        System.out.println(isStringsubsequenceJava8(st, "d"));

    }

    public static boolean isStringsubsequenceJava8(String source, String dest) {
        if (dest == null || dest.length() == 0)
            return true;
        if (source == null || source.length() == 0) {
            return false;
        }
        final int[] counter = {0};
        source.chars().anyMatch(c -> {
            if (dest.charAt(counter[0]) == (char) c) {
                counter[0]++;
            }
            return counter[0] == dest.length();
        });
        return counter[0] == dest.length();

    }

    public static boolean isStringSubsequnce(String dest, String source) {
        if (dest == null || dest.length() == 0)
            return true;
        if (source == null || source.length() == 0)
            return false;

        //here source is string where we are trying to find the dest string
        // dest → what we want to match
        //source → where we search
        int i = 0;
        int j = 0;

        while (i < source.length() && j < dest.length()) {
            if (source.charAt(i) == dest.charAt(j)) {
                j++; //moves when match is found
            }
            i++; //moves everytime
        }
        return j == dest.length();  //it is match
    }

    public static List<String> getAllSubsequnce(String st) {

        if (st.length() == 0) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        char c = st.charAt(0);
        String subst = st.substring(1);
        List<String> receive = getAllSubsequnce(subst);
        //--,b-,bc,c
        //--,b--,bc,c-,---,ab-,abc,ac-
        List<String> finalresult = new ArrayList<>();
        for (int i = 0; i < receive.size(); i++) {
            finalresult.add(receive.get(i));
            finalresult.add(receive.get(i) + c);

        }
        return finalresult;
    }

    public static List<String> generateSubsequenceAndPrint(String st, String ans) {
        if (st.length() == 0) {
            //  System.out.println("substr:" + ans);

            List<String> result = new ArrayList<>();
            result.add(ans);
            return result;
        }

        char first = st.charAt(0);
        String rest = st.substring(1);
        //exclude
        List<String> left = generateSubsequenceAndPrint(rest, ans);
        System.out.print("left:" + left);
        //include
        List<String> right = generateSubsequenceAndPrint(rest, ans + first);
        System.out.print(right);

        // merge both
        left.addAll(right);
        return left;
    }

    public static List<String> getSubsequnce(String str) {
        // Total subsequences=2n
        //time:- O(n · 2ⁿ)
        //space: O(n · 2ⁿ)  we can not optimised both recursion and iterative
        if (str.length() == 0 || str.isBlank() || str.isEmpty())
            return new ArrayList<>();

        List<String> result = new ArrayList<>();
        result.add("");
        for (char c : str.toCharArray()) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                result.add(c + "" + result.get(i));
            }
        }

        return result;
    }
}
