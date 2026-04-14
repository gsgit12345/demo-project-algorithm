package org.example.binarytree;

import java.util.Stack;

public class BinaryTreeIterative {
    public Node constructBinaryTree(Integer arra[]) {

//        Time complexity is the same for both: O(n)
//        Space complexity depends on tree height (log n for balanced, n for skewed)

        Node rootNp = new Node(arra[0], null, null);
        Paire root = new Paire(rootNp, 1);
        Stack<Paire> statck = new Stack<>();

        statck.push(root);
        int index = 0;

        while (statck.size() > 0) {
            Paire top = statck.peek();
            if (top.state == 1) {
                index++;
                if (index < arra.length && arra[index] != null) {
                    top.node.left = new Node(arra[index], null, null);
                    Paire left = new Paire(top.node.left, 1);
                    statck.push(left);
                } else {
                    top.node.left = null;
                }
                top.state++;

            } else if (top.state == 2) {
                index++;
                if (index <= arra.length && arra[index] != null) {
                    top.node.right = new Node(arra[index], null, null);
                    Paire right = new Paire(top.node.right, 1);
                    statck.push(right);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                statck.pop();
            }
        }
        return rootNp;
    }

    public void preOrder(Node root) {

//        Root → Left → Right
//        1-First, visit the current node (root)
//        2-Then visit the left subtree
//        3-Finally, visit the right subtree

        if (root == null)
            return;
        String st = "";
        st += (root.left == null ? "." : root.left.data) + " ";
        st += "<-" + root.data + "<-";
        st += (root.right == null ? "." : root.right.data);
        System.out.println(st);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root) {

//        Postorder traversal is a way to visit all nodes of a binary tree in the order:
//        Left Subtree → Right Subtree → Root
//        1-First, recursively visit the left subtree.
//        2-Then, recursively visit the right subtree.
//        3-Finally, visit the root node.
//        Time complexity: O(n)
//        Space complexity: O(h), h = tree height
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + ",");
    }
public void inOrderTraversal(Node root)
{
    if(root==null)
        return ;

    inOrderTraversal(root.left);
    System.out.println(root.data);
    inOrderTraversal(root.right);
}
    public int printSize(Node root) {
        if (root == null)
            return 0;

        int left=printSize(root.left);
        int right=printSize(root.right);
        return left+right+1;
    }
public int findMax(Node root)
{
    int size=findMax(root.left);
    findMax(root.right);
    return 0;
}
public int height(Node root)
{
    //-1 means your are calculating the height in term of edges and 0 means you are measuring height in term of the node.
    return 0;
}
public void levelOrderPrint(Node root)
{
    // 1-RPA Algorithmn.means remove and print and then the child in queue

}
public void PrePostInorderIterativeTraversal(Node root)
{
    // https://www.youtube.com/watch?v=12aMTS0L6WI&list=PL-Jc9J83PIiHYxUk8dSu2_G7MR1PaGXN4&index=13
//     state =1 ,increase the state and go to the left and print  --pre-order
//     state=2 increase the state and go to the right and print --in order
//     state=3 pop and print     post order
//    1-Create a class paire and make node as member variable.Also add state as member variable
//    2-run a loop till stacke.size>0 and push the root in stack and if state is 1 then print it in Pre-Order and increase the state.go to the left
//    3-again check that state is 2 then print it  and increase the state and go to the right
//    4-if state is 3 then print it in post order and pop the statck


}
public  void  nodeToRootPathPrintDtata(Node root,int data)
{
//    1-First find the data
//    2-Where you will the data ,from there till root node ,putt all value in the list and return
//      3-check the data with root
//      4-call recursively in left node and find
//      5-Same check in the right sub tree
}
public void printKlevelAllNodeValue(Node root,int k)
{

}
    public static void main(String str[]) {

        Integer arr[] = {10, 20, 30, 80, null, null, 70, 90, null, null, null, null, 100, 120, null, null, null, null};
        BinaryTreeIterative tree = new BinaryTreeIterative();
        Node node = tree.constructBinaryTree(arr);
        // tree.display(node);

        tree.postOrder(node);

       int size= tree.printSize(node);
       System.out.println();
       System.out.println("size :"+size);

    }
}
