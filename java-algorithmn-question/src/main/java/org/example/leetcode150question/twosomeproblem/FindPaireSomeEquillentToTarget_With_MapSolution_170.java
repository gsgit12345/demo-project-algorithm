package org.example.leetcode150question.twosomeproblem;

import java.util.HashMap;
import java.util.Map;

public class FindPaireSomeEquillentToTarget_With_MapSolution_170 {

    Map<Integer, Integer> frequency = null;

    FindPaireSomeEquillentToTarget_With_MapSolution_170() {
        frequency = new HashMap<>();
    }

    public void addToMap(int value) {
        if (frequency != null) {
            frequency.merge(value, 1, (oldv, newv) -> oldv + newv);
            //or we can write as below
            // frequency.merge(value,1,Integer::sum);
            //or we can write
            // frequency.put(value,frequency.getOrDefault(value,0)+1);

        }

    }

    public boolean findPaire(int value) {
        //  time and space:- big(n)
//        1-loope the map and take the key from map
//        2-subtract the num from target within loop
//        3-now take the value from map against key
//        4-now put the if condition that complement =!num and count >0 then return true.
//        this condition say in frequncy map there is unique number
//        5-now we if check that if map contains the duplicate  like complement==num and count>1   then return true

        for (int num : frequency.keySet()) {
            int complement = value - num;
            int count = frequency.getOrDefault(complement, 0);

            if (complement != num && count > 0) {
                //if number has no duplicate in hashmap
                return true;
            }
            if (complement == num & count > 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String str[]) {
        FindPaireSomeEquillentToTarget_With_MapSolution_170  test =
                new FindPaireSomeEquillentToTarget_With_MapSolution_170();


    }
}
