package org.example.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class GreyCodeAlgorithmn {
    public static void main(String str[]) {
        //greycode algorithmn says thta next bit would differe to the previous one
        // in the sequence like 01,10,11,00

       List<String> result= generateGreyCode(3);
       System.out.println(result);
    }

    public static List<String> generateGreyCode(int n) {
        if (n == 1) {
            List<String> rr = new ArrayList<>();
            rr.add("0");
            rr.add("1");

            return rr;
        }
        List<String> result = generateGreyCode(n - 1);
        List<String> finalresult = new ArrayList<>();
        for (String code : result) {
            finalresult.add("0" + code);
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            finalresult.add("1" + result.get(i));
        }
        return finalresult;
    }
}
