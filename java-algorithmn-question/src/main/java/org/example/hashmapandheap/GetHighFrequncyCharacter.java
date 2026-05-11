package org.example.hashmapandheap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetHighFrequncyCharacter {
    public static void main(String str[]) {
        String st = "abcaweraassaaa";

        highFrequcncy(st);

        usingJava8(st);
    }

    public static void highFrequcncy(String st) {
        char[] chrt = st.toCharArray();
        Map<Character, Integer> frequncy = new HashMap<>();
        for (char c : chrt) {
            if (frequncy.containsKey(c)) {
                int v = frequncy.get(c);
                frequncy.put(c, v + 1);
            } else {
                frequncy.put(c, 1);
            }
        }
        Character c = ' ';
        int max = 0;
        for (Map.Entry<Character, Integer> cc : frequncy.entrySet()) {
            if (cc.getValue() > max) {
                max=cc.getValue();
                c=cc.getKey();
            }
        }
        System.out.println(max +":key:"+c);
    }
    public static void usingJava8(String st)
    {
      Map<Character,Long> frequency=  st.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(),
              Collectors.counting()));

      System.out.println(frequency);

     Character mx= frequency.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

     System.out.println(mx);

    }
}
