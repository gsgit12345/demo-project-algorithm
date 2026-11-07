package org.example.leetcode150question.twosomeproblem;

import java.util.ArrayList;
import java.util.List;

public class FindPaireSomeEquillentToTarget_With_NaiveApproach_170 {
    List<Integer> data = null;

    FindPaireSomeEquillentToTarget_With_NaiveApproach_170() {
        data = new ArrayList<>();
    }

    public void addNum(int number) {
        data.add(number);
    }

    public boolean findNumber(int target) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = i + 1; j < data.size(); j++) {
              if(data.get(i)+data.get(j)==target)
              {
                  return true;
              }
            }
        }
        return false;
    }

    public static void main(String str[]) {
        FindPaireSomeEquillentToTarget_With_NaiveApproach_170  naive=new FindPaireSomeEquillentToTarget_With_NaiveApproach_170();
        naive.addNum(1);
        naive.addNum(2);
        naive.addNum(3);
        naive.addNum(4);
        int target=7;
        boolean found=naive.findNumber(target);
        System.out.println(found);


//        complexity --space-big(n)
//                   -- time big(n2)
    }
}
