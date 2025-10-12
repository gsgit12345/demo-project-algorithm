package org.example.generictree;

import java.util.Stack;

public class GenericTreeIterativeSolution {

    public GenericNode createTree(int array[]) {
        if (array == null || array.length == 0)
            return new GenericNode(-1);

        Stack<GenericNode> stack = new Stack<>();
        GenericNode root = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                // End of children for current node, go back to parent
                stack.pop();
            } else {
                GenericNode child = new GenericNode(array[i]);
                if (!stack.isEmpty()) {
                    // Add as child to the node on top of stack
                    stack.peek().children.add(child);
                } else {
                    // If stack is empty, this is root
                    root = child;
                }
                // Push the node to stack (it may have children next)
                stack.push(child);

            }
        }
        return  root;
    }
public void printTreePreOrderAndPostOrder(GenericNode root)
{

//    1-Create the stack and push the root with state -1
//    2-start the while loop and condition till stack size would be greater than 0
//    3-Get the top node from the stack
//    4-put the if condition and check that is state is -1
//    5-take the tope node's data and store in a variable' and increase the state
//    6-put the elseif and check that top's state is equivalent to the children size or not.if condition true then take data and store in variable and pop from the stack
//    7-in else part create a paire  and take the node from top and with state 0 and push in the statck
 //     8-At the last print the pre and post data and increase the state
}
    public static void main(String str[]) {
        int array[] = {10, 20, -1, 30, 80, -1, 90, -1, 40, -1, -1, 70, 100, -1, -1};

        GenericTreeIterativeSolution genericTreeIterativeSolution = new GenericTreeIterativeSolution();

        genericTreeIterativeSolution.createTree(array);

    }
}
