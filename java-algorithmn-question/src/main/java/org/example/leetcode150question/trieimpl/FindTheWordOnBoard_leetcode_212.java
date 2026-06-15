package org.example.leetcode150question.trieimpl;

import java.util.ArrayList;
import java.util.List;

public class FindTheWordOnBoard_leetcode_212 {
    static class Node {
        Node[] child = new Node[26];
        String str;
    }

    public static void insertIntoTrie(Node root, String st) {
        if (root == null || st == null || st.length() == 0)
            return;
        st = st.toLowerCase();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            int index = ch - 'a';
            if (root.child[index] == null) {
                root.child[index] = new Node();
            }
            root = root.child[index];
        }
        root.str = st;
    }

    public static List<String> findWordOnBoard(char board[][], String words[]) {
        Node root = new Node();
        List<String> ans = new ArrayList<>();

        if (board == null || board.length == 0 || board[0].length == 0 || words == null || words.length == 0) {
            return ans;
        }
        //insert the word in tri
        for (String ch : words) {
            insertIntoTrie(root, ch);
        }
        boolean visisted[][] = new boolean[board.length][board[0].length];
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char ch = board[i][j];
                if (root.child[ch - 'a'] != null) {
                    bradthFirstSearch(board, i, j, root, visisted, ans);
                }


            }
        }
        return ans;
    }

    public static void bradthFirstSearch(char board[][], int row, int col, Node root, boolean[][] visited, List<String> ans) {

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || root == null || visited[row][col] == true)
            return;

        char ch = board[row][col];
        if (root.child[ch - 'a'] == null) {
            return;
        }
        visited[row][col] = true;
        Node node = root.child[ch - 'a'];
        if (node.str != null) {
            ans.add(node.str);
            node.str = null;
        }
        bradthFirstSearch(board, row + 1, col, node, visited, ans);
        bradthFirstSearch(board, row - 1, col, node, visited, ans);
        bradthFirstSearch(board, row, col + 1, node, visited, ans);
        bradthFirstSearch(board, row, col - 1, node, visited, ans);


        visited[row][col] = false;


    }

    public static void main(String str[]) {

        //if we do not use the boolean visisted then thois code is equvalent to leetcode

        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };

        String[] words = {
                "oath",
                "pea",
                "eat",
                "rain"
        };

        List<String> result=findWordOnBoard(board,words) ;

        System.out.println(result);

    }
}
