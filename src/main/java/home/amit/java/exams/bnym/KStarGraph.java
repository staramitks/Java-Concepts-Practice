package home.amit.java.exams.bnym;
/*
User :- AmitSingh
Date :- 9/9/2023
Time :- 7:17 AM
Year :- 2023
*/

import java.util.*;
import java.util.*;

import java.util.*;

public class KStarGraph {
    public static int bestSumKStar(int g_nodes, int[] g_from, int[] g_to, int[] values, int k) {
        // Create an adjacency list representation of the graph.
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < g_nodes; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < g_from.length; i++) {
            graph.get(g_from[i] - 1).add(g_to[i] - 1);
            graph.get(g_to[i] - 1).add(g_from[i] - 1);
        }

        int maxSum = 0;

        // Iterate through all nodes to find k-stars centered at each node.
        for (int i = 0; i < g_nodes; i++) {
            int centerValue = values[i];
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int neighbor : graph.get(i)) {
                maxHeap.add(values[neighbor]);
            }

            int starSum = centerValue; // Include the value of the center node.
            int arms = 0;

            while (!maxHeap.isEmpty() && arms < k) {
                starSum += maxHeap.poll();
                arms++;
            }

            maxSum = Math.max(maxSum, starSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int g_nodes = 5;
        int[] g_from = {3, 3, 3, 3};
        int[] g_to = {1, 2, 4, 5};
        int[] values = {10, 20, 30, 40, 50};
        int k = 2;
        int result = bestSumKStar(g_nodes, g_from, g_to, values, k);
        System.out.println("Largest sum of a non-empty k-star: " + result);
    }
}
