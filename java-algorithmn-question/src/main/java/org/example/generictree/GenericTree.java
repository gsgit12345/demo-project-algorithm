package org.example.generictree;

import java.sql.Array;
import java.util.*;

public class GenericTree {
    static class Index {
        public int idx = 0;
    }

    public GenericNode createGenericTree(int[] array, Index index) {

        if (index.idx > array.length || array[index.idx] == -1) {
            index.idx++;
            return null;
        }
        //current node
        GenericNode root = new GenericNode(array[index.idx]);
        index.idx++;
        while (true) {
            GenericNode chile = createGenericTree(array, index);
            if (chile == null)
                break;
            root.children.add(chile);
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

    public int heightOfTree(GenericNode node, boolean heightInTermOfEdge) {
        // we can get in term of  edge and node
        //when i will findout height in term of edhe then initialize the variable with -1 and
        // when you try to find out height in term of node then initialise with 0
        if (node == null)
            return heightInTermOfEdge ? -1 : 0;
        int h = heightInTermOfEdge ? -1 : 0;
        for (GenericNode child : node.children) {
            int ch = heightOfTree(child, heightInTermOfEdge);
            h = Math.max(h, ch);
        }
        h = h + 1;
        return h;
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

        if (node == null)
            return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (GenericNode child : node.children) {
            int ch = maxValueInTree(child);
            max = Math.max(ch, max);
        }
        max = Math.max(node.data, max);
        return max;
    }

    public void levelOrderTraversal(GenericNode node) {
        // It means print first Root and then its child and if child has child and then first child will
        // become parent and first print parent and then child and this
        // Remove,print,add
        Queue<GenericNode> queue = new ArrayDeque();
        queue.add(node);
        while (queue.size() > 0) {
            node = queue.remove();
            System.out.println(node.data + " ");
            for (GenericNode child : node.children) {
                queue.add(child);

            }
        }
        // System.out.print(" .");
    }

    public void levelOrderLinewise(GenericNode root) {
        if (root == null) return;

        Queue<GenericNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                GenericNode ch = queue.remove();

                // Print parent => children
                System.out.print(ch.data + " => ");
                for (GenericNode child : ch.children) {
                    System.out.print(child.data + " ");
                    queue.add(child);
                }
                System.out.print("   "); // spacing between nodes
            }
            System.out.println(); // newline after level
        }

    }

    public void levelOrderTraversallinewiseApproach2(GenericNode node) {

//        1-create one queue that is main queue and add in it root and new node with -1 value
//        2-start the loop on main queue and remove
//        3-checked removed element is -1 if it is null then add -1 in the main queue and print enter
//        4- otherwise  print the data and add the children in the queu
        //    5-if you want to add null marker then take linkedlist.not arraydequeu
    }

    public void levelOrderTraversallinewiseApproach3(GenericNode node) {

//        1-create one queue that is main queue and add in it root
//        2-start the loop on main queue and get the size of main queue
//        3-start a loop till the main queue size amd remove and print
        //       4- using q loop add the child in the main queue
//        4- at the las the of the while loop print a new line

    }


    public void levelOrderTraversallinewiseApproach4(GenericNode node) {


    }

    public void mirrorOfGenericTree(GenericNode node) {

    }

    public GenericNode removeLeaf(GenericNode node) {
//    1-start a loop  till children size from right to left
//    2-Gent the node by index
//    2-check that child has  leaf or not .if children has leafe then removeLeaf; if child's size is 0 then there is no leaf node further
        //    3-remove the leaf
//    3-do in pre order not in post order.mean run a loop in childrenn and call the function recursivly

        for (int i = node.children.size() - 1; i >= 0; i--) {
            GenericNode leaf = node.children.get(i);
            if (leaf.children.size() == 0) {
                node.children.remove(leaf);
            }
        }
        for (GenericNode child : node.children) {
            removeLeaf(child);
        }
        return node;
    }

    public GenericNode removeLeafSecondApproach(GenericNode node) {
//    1-start a loop  till children size from right to left
//    2-Gent the node by index
//    2-check that child has  leaf or not .if children has leafe then removeLeaf; if child's size is 0 then there is no leaf node further
//    3-remove the leaf
//    3-do in pre order not in post order.mean run a loop in childrenn and call the function recursivly

        for (int i = node.children.size() - 1; i >= 0; i--) {
            GenericNode child = node.children.get(i);
            if (child.children.isEmpty()) {
                node.children.remove(child);
            } else {
                removeLeafSecondApproach(child);
            }
        }
        return node;
    }

    public void linariseTheGenericTree(GenericNode node) {
        // https://www.youtube.com/watch?v=TKZEBXtzKSM&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=24
        //https://www.youtube.com/watch?v=D5RYXVgJ5NM&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=25
    }

    public void levelOrderLinewiseZigZag(GenericNode root) {
        //https://www.youtube.com/watch?v=eDdPZ05y4Os&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=17
//        1-create a variable level and initialize it with 1
//        2-if level is even then traverse from left to right other wise right to left and add in the child statck
//        3-check that main stack is become zero if zero then increment level and create new child stack and swap with main

    }

    public GenericNode findElement(GenericNode root, int element) {
//    1-In pre ordr check the data with the root's data'
//    2-start a loop in child element and call function recursively
//    3-other wise return false or data

        if (root.data == element)
            return root;

        for (GenericNode child : root.children) {
            GenericNode data = findElement(child, element);
            if (data.data == element) {
                return data;
            }
        }
        return new GenericNode(-1);
    }

    public ArrayList<Integer> findNodeToRootElement(GenericNode root, int element) {
        // https://www.youtube.com/watch?v=oEBwL5pHzTs&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=29
        //   1-where elemnt find in the tree from there till root we need all element in the arraylist
        if (root.data == element) {
            ArrayList<Integer> array = new ArrayList<>();
            array.add(root.data);
            return array;
        }

        for (GenericNode child : root.children) {
            ArrayList<Integer> result = findNodeToRootElement(child, element);
            if (!result.isEmpty()) {
                result.add(root.data);
                return result;
            }
        }

        return new ArrayList<>();
    }

    public int findLCA(GenericNode root, int d, int d1) {
        return 0;
    }

    public int distanceBetweenTwoNode(GenericNode root, int d, int d1) {
        return 0;
    }

    public void treeTraversal(GenericNode node) {
        // before going  into  recursion.left side in Eular
        // pre order  traversal
        System.out.println("pre-order -" + node.data);
        for (GenericNode child : node.children) {
            System.out.println("edge pre-area -" + node.data + "-->" + child.data);
            treeTraversal(child);
            System.out.println("edge post-area -" + node.data + "-->" + child.data);

        }
        System.out.println("post-order -" + node.data);
        //after coming out of the recursion . right side  in the Eular
        // post order traversal
    }

    public boolean areTreeSimiliarInShape(GenericNode node, GenericNode node2) {
//        1-Parents's child shoud be similiar in size'.it would be test in pre-order
//        2-then child also should be similar in shape.run the loop in second pre-order and put the function call in if statement
        //   3-get the children of both node

        return true;
    }

    public boolean areTreeMirrorInShape(GenericNode node, GenericNode node1) {
        // 1-first check bothe node's child's size is same or not
        // 2- take the left node of the node1 and right node of the node
        // 3-call function recursivly in if condition and check
        // 4- if condition does not satisfy return false
        return true;
    }

    public boolean isTreeSymetric(GenericNode node, GenericNode node1) {
        //put the are mirror code here
        return true;
    }

    public void multiSolver(GenericNode node) {
//travel and change logic.find height,size,min,max
    }

    public void findPredessorAndSuccessor(GenericNode node,int target)
    {

    }
    static int ceil;
    static  int floor;
public void findCeilAndFloor(GenericNode node,int data)
{

}
public int findKthLargest(GenericNode node,int k)
{
//    1-set the floor value.floor means largest among smallest.
//    2-ceil means smallest among largest
//    3-run the loop till kth
//    4-call the findceil and floor function and parameter would be infinity(take a variable factor and assign with infinity value) and node
//    5-
    return 0;
}
static int msst=0;
static int maxSum=Integer.MIN_VALUE;
public int maximumSumOfSubtree()
{
    // 1-find the subtree which has maximum value after addition of its child
    // 2-Travel and change strategy
    // 3-traverse the tree and find the sum of all node .call function recursivly
    // 4-in below compare that sum is greater than maxsum if yes then assign the value
    // 5-At last return the value

return 0;
}

public  int findMaximumEdegBetweenTwoNodeOrDiameterInTree(GenericNode node)
{
    // https://www.youtube.com/watch?v=GIA2cZgOdwg&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=50
//    1-Calcualte the height of each subtree in tree
//    2- find the maximum height and second maximum height
//     3-apply the formula cand=maxheight+secondheight+2
//     4-compare with diameter if cand is greater than diameter then assign the value
//     5-Return the  maximumsecondheight+1

    return 0;
}
    public static void main(String str[]) {
        // int array[] = {10, 11, 12, -1, -1, 13, 14, 15, 30, -1, 20, -1, -1, 100, 20, 30, -1, -1, -1};
        int array[] = {10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};


        GenericTree genericTree = new GenericTree();

        GenericNode node = genericTree.createGenericTree(array, new GenericTree.Index());
        System.out.println(node.children);

        genericTree.printGenericTree(node);

        int size = genericTree.sizeOfTree(node);
        System.out.println(size);
        // genericTree.printGenericTreeFromLeaf(node);
        int height = genericTree.heightOfTree(node, true);
        System.out.println("h:" + height);
        int max = genericTree.maxValueInTree(node);
        System.out.println("max is::" + max);
        genericTree.levelOrderTraversal(node);
        genericTree.levelOrderLinewise(node);
        ArrayList<Integer> result = genericTree.findNodeToRootElement(node, 50);
        System.out.println("leaf to root:" + result);
        // GenericNode resultnode = genericTree.removeLeaf(node);

        // System.out.println(resultnode);

        GenericNode data = genericTree.findElement(node, 30);
        System.out.println(data.data);
    }
}
