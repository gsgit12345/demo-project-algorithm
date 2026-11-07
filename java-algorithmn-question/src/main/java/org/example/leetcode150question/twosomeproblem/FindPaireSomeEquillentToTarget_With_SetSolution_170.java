package org.example.leetcode150question.twosomeproblem;

import java.util.HashSet;
import java.util.Set;

public class FindPaireSomeEquillentToTarget_With_SetSolution_170 {

//    1-note this solution is applicable where duplicate is not allowed but leetcode 170 is saying that
//            we can take the duplicate number
    Set<Integer> data=null;
    FindPaireSomeEquillentToTarget_With_SetSolution_170()
    {
        data=new HashSet<>();
    }
    public void add(int value)
    {
        data.add(value) ;
    }
    public boolean findPaire(int target)
    {
        for(int num:data)
        {
            int complement=target-num;  //try to get second number of the paire.
            // we are considering target is the first number of the paire
             if(complement!=num && data.contains(complement))
             {
                 return true;
             }
        }
        return false;
    }

    public static void main(String str[])
    {
//        note:-this approach will work where interviewer will asked
//              that duplicate is not allowed.but leet code 170 says that duplicate allowed
        FindPaireSomeEquillentToTarget_With_SetSolution_170 test=new FindPaireSomeEquillentToTarget_With_SetSolution_170();
        test.add(1);
        test.add(8);
        test.add(12);
        test.add(3);
        int target=11;

       boolean find= test.findPaire(11);
       System.out.println(find);

       test.add(0);
       test.add(1);
       boolean find2=test.findPaire(0);
        System.out.println(find2);


    }
}
