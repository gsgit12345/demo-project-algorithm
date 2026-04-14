package org.example.bitmanipulation;

public class FindTwoUniqueElementFromArray {
    public static void main(String str[]) {
        /*
        1-take the xor of the all numbner
        2-find the rightset bit mask
        3-traverse the array and put condition
        if val&rsb==0
        4-take the xor of number ending 0 in binary and ending 1 in binary seperatly
         */

        int[] nums = {2, 3, 5, 4, 5, 3, 4, 6};

        String arr[]={"2", "3", "5", "4", "5", "3", "4", "6"};

        int unique = 0;
        for (int v : nums) {
            unique = unique ^ v;
        }
        int rsb = unique & -unique;

        int x = 0;
        int y = 0;

        for (int v : nums) {
            if ((v & rsb) == 0) {
                x=x^v;
                //System.out.println("first unique:" + x);
            }else {
                y=y^v;

               // System.out.println("second unique:" + y);

            }
        }

        System.out.println("big:"+y+":x:"+x);

        if(x<y)
        {
            System.out.println("big:"+y);
        }else {
            System.out.println(x);

        }

    }

}
