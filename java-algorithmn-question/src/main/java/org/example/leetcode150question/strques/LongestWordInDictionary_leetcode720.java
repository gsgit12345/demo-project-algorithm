package org.example.leetcode150question.strques;

public class LongestWordInDictionary_leetcode720 {
    public static String ans = "";

    public static void main(String[] str) {

        String words[] = {
                "w",
                "wo",
                "wor",
                "worl",
                "world"
        };

        String[] words1 = {"cat", "dog", "bat"};
        String[] words2 = {"a", "ap", "app", "apple"};
        String[] words3 = {"cat", "cat", "cat"};
        String[] words4 = {"cat", "dog1", "hello!"};
        String result = longestWordInDict(words4);

        System.out.println("Longest Word = " + result);
    }

    public static void insertNode(Node curr, String s) {

        if (s == null || s.length() == 0) {
            return;
        }
        s = s.toLowerCase(); //converting to lower case

        StringBuilder clean = new StringBuilder(); //remove the special character from string


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < 'a' || ch > 'z')  //checking  the special character
                continue;
            int index = ch - 'a';
            clean.append(ch);
            if (curr.childs[index] == null) //if arrayindex contains null
            {
                curr.childs[index] = new Node();  //create new node and assign to the index
            }
            curr = curr.childs[index];

        }
        // curr.str = s;  //it store special character

        curr.str = clean.toString();

    }

    public static void deftFirstSearch(Node root) {

        if (root == null)
            return;
        for (Node child : root.childs) {
            if (child != null && child.str != null) {
                if (child.str.length() > ans.length()) {
                    ans = child.str;
                }
            }
            deftFirstSearch(child);
        }
    }

    public static String longestWordInDict(String[] word) {

        Node root = new Node();
        for (String s : word) {
            insertNode(root, s);
        }
        deftFirstSearch(root);
        return ans;

    }

    public static class Node {

        Node[] childs = new Node[26];
        String str;


    }
}


/*
import java.io.*;
import java.util.*;

public class Main {

    // Trie Node
    public static class Node {

        Node childs[] = new Node[26];
        String str;
    }

    // answer variable
    static String ans = "";

    // Insert word into Trie
    public static void insert(Node curr, String s) {

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (curr.childs[ch - 'a'] == null) {
                curr.childs[ch - 'a'] = new Node();
            }

            curr = curr.childs[ch - 'a'];
        }

        curr.str = s;
    }

    // DFS Traversal
    public static void dfs(Node root) {

        for (Node child : root.childs) {

            if (child != null && child.str != null) {

                if (child.str.length() > ans.length()) {
                    ans = child.str;
                }

                dfs(child);
            }
        }
    }

    // Main Logic
    public static String longestWord(String[] words) {

        Node root = new Node();

        // insert all words
        for (String s : words) {
            insert(root, s);
        }

        // perform dfs
        dfs(root);

        return ans;
    }

    public static void main(String[] args) {

        String words[] = {
                "w",
                "wo",
                "wor",
                "worl",
                "world"
        };

        String result = longestWord(words);

        System.out.println("Longest Word = " + result);
    }
}
 */