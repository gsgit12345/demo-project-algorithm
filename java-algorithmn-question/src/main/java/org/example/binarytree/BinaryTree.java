package org.example.binarytree;

public class BinaryTree {

    public int index;

    public Node constructBinary(Integer array[]) {

        if (array == null || array.length == 0)
            return null;
        index++;
        return construct(array);
    }

    private Node construct(Integer array[]) {
        if (index >= array.length || array[index] == null) {
            index++;
            return null;
        }

        Node node = new Node(array[index++], null, null);
        node.left = construct(array);
        node.right = construct(array);
        return node;

    }

    public static void main(String str[]) {

    }
}
