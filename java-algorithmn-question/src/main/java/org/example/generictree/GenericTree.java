package org.example.generictree;

import java.util.Stack;

public class GenericTree {
    public GenericNode createGenericTree(int[] array) {
        Stack<GenericNode> stack = new Stack<>();
        GenericNode root = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                stack.pop();
            } else {
                GenericNode node = new GenericNode();
                node.data = array[i];
                if (stack.size() > 0) {
                    stack.peek().children.add(node);
                } else {
                    root = node;
                }
                stack.push(node);

            }
        }
        return root;
    }

    public void printGenericTree(GenericNode node) {
        String val = node.data + "=>";

        for (GenericNode root : node.children) {
            val += root.data + ",";
        }
        val += ".";
        System.out.println(val);
        for (GenericNode child : node.children) {
            printGenericTree(child);
        }
    }

    public void printGenericTreeFromLeaf(GenericNode node) {
        for (GenericNode child : node.children) {
            printGenericTreeFromLeaf(child);
        }

        System.out.println(node.data);

    }

    public int sizeOfTree(GenericNode node) {
        int size = 0;
        for (GenericNode child : node.children) {
            int sc = sizeOfTree(child);
            size = size + sc;
        }
        return size + 1;
    }

    public int heightOfTree(GenericNode node) {
        // we can get in term of  edge and node
        //when i will findout height in term of edhe then initialize the variable with -1 and
        // when you try to find out height in term of node then initialise with 0
        return 0;
    }

    public void preOrderTraversal(GenericNode node) {
// 1-Node's left side before going in the recursion
// 2-Node is first printed
// 3- before recursion method code is written
    }

    public void postOrderTraversal(GenericNode node) {
// 1- Node's right side while coming out of recursion
// 2- root is printed last
// 3- after recursion method call
    }

    public int maxValueInTree(GenericNode node) {
        return 0;
    }
    public void treeTraversal(GenericNode node)
    {
        // before going  into  recursion.left side in Eular
        // pre order  traversal
        System.out.println("pre-order -"+node.data);
        for(GenericNode child:node.children)
        {
            System.out.println("edge pre-area -"+node.data+"-->"+child.data);
            treeTraversal(child);
            System.out.println("edge post-area -"+node.data+"-->"+child.data);

        }
        System.out.println("post-order -"+node.data);
        //after coming out of the recursion . right side  in the Eular
        // post order traversal
    }

    public static void main(String str[]) {
        // int array[] = {10, 11, 12, -1, -1, 13, 14, 15, 30, -1, 20, -1, -1, 100, 20, 30, -1, -1, -1};
        int array[] = {10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};

        GenericTree genericTree = new GenericTree();

        GenericNode node = genericTree.createGenericTree(array);
        System.out.println(node.children);

        genericTree.printGenericTree(node);

        int size = genericTree.sizeOfTree(node);
        System.out.println(size);
        // genericTree.printGenericTreeFromLeaf(node);

    }
}
