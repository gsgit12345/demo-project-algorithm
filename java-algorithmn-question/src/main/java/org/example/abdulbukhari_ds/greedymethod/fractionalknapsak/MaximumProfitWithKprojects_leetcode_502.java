package org.example.abdulbukhari_ds.greedymethod.fractionalknapsak;


public class MaximumProfitWithKprojects_leetcode_502 {

//    1-we had given  w=0 -this is amount to start a project
//    2-K --number of project we can take
//    3-array of profit  this show how much profit we can gain after project completion
//    4-array of capital that we can invest in project to start or complete
//    5-you have to telll max profit

//    solution step
//
//     1-we have to take array in which we have to store capital and profit
//     2-sort the array by capital in ascending order
//     3-Sort the array by profit in descending order  and put into priorityque
//     4-  run a while loop and k>0
//       5-take inner  while loop and check the condition  i<arr.length && arr[i].capital <w
//       6- put the capital into maxheap like maxheap.add(arr[i])
//    7-ouside of inner loop check maxheap.size<0 then break
//    8-w =w+maxheap.profit
//    9-return the w


}



/*


class Solution {
    class Project {
        int capital;
        int profit;

        Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Project[] arr = new Project[capital.length];
        for (int i = 0; i < capital.length; i++) arr[i] = new Project(capital[i], profits[i]);
        Arrays.sort(arr, new Comparator<Project>() {
            public int compare(Project p1, Project p2) {
                return p1.capital - p2.capital;
            }
        });  //sorting with captal in ascending order
        int i = 0;
        PriorityQueue<Project> pq = new PriorityQueue<>(new Comparator<Project>() {
            public int compare(Project p1, Project p2) {
                return p2.profit - p1.profit;
            }
        });
        while (k-- > 0) {
            while (i < arr.length && arr[i].capital <= w) {
                pq.add(arr[i]);
                i++;
            }
            if (pq.size() == 0) break;
            w = w + pq.poll().profit;
        }
        return w;
    }

 */
