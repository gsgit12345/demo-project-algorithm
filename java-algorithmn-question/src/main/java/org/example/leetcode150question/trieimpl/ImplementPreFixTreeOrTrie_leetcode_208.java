package org.example.leetcode150question.trieimpl;

class Trie {
    static class Node {
        Node child[] = new Node[26];
        boolean isEndOfWord;
    }

    Node root;

    public Trie() {

    }

    public void insert(String word) {
    }

    public void searchPrefix(String word) {
        root = new Node();
    }

    public boolean startsWith(String prefix) {

        return true;
    }


}

public class ImplementPreFixTreeOrTrie_leetcode_208 {
}
