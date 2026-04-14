package org.example.graph;

public class NumberOfIsLandUsingGraph {
    public static void main(String str[])
    {
        int[][] arr = {
                {0, 0, 1},
                {1, 0, 1},
                {1, 1, 0}
        };

        int[][] arr1 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[][] arr2 = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };
        int[][] arr3 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int[][] arr4 = {
                {0, 1, 0, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {0, 0, 1, 0}
        };
    }

    public static void numberOfIsland(int arr[][])
    {
        boolean [][] visited=new boolean[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
           if(arr[i][j]==0 && visited[i][j]==false)
                {
                    traverseArray(arr,i,j,visited);
                }
            }
        }
    }

    public static void traverseArray(int [][] arr,int i,int j,boolean[][] visisted)
    {

        if(i<arr.length || j<arr[0].length || visisted[i][j]==true || i<0 || j<0)
        {

        }
        visisted[i][j]=true;

        traverseArray(arr,i+1,j,visisted);
        traverseArray(arr,i,j+1,visisted);
        traverseArray(arr,i-1,j,visisted);
        traverseArray(arr,i,j-1,visisted);



    }

}
