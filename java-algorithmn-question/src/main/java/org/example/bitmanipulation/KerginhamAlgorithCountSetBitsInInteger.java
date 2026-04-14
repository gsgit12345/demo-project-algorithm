package org.example.bitmanipulation;

public class KerginhamAlgorithCountSetBitsInInteger {
    public static void main(String str[])
    {
//count setbits in an integer.

        int num=10;
        int counter=0;
        while(num!=0)
        {
          int rsmb=num & -num;
          num-=rsmb;
          counter++;
        }
        System.out.println(counter);
    }
}
