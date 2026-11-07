package org.example.leetcode150question.strques.anagramproblem;

public class GroupAnagram_Leetcode_49 {
    public static void main(String str[])
    {
//        1-anagram means same character in different order but length shoud be same
//        2-you had givien string of arraythat contains the strings
//          3-identify which string is anagram of each other and group them into seperate list
//          4-Return all group as a list
        //solution
//        2-take a hashmap as string and list<list>
//        1-run a loop on string of array
//        2-take one string from array and convert into char array
//        3-Sort the char array and again convert into string
//        4-check that in map it is not present as a key
//        5-in if block you have to put as a key and value list
//        6-outside of the if block you have to get the key and add the str into list
//        7-at last u have to return the map.values that will return list of list


        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]] // in ascending order by character

        String strs1[] = {""}; // answer would be same

        String strs2[] = {"a"}; //  answer would be same


    }
}
