# Negative Weight Cycle

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a weighted directed graph containing  **V**  vertices numbered from 0 to V - 1 and a list of  **E**  directed edges  **edges[][]**, determine whether the graph contains a negative weight cycle or not.

Each edge is represented as: [u, v, w], where there is a directed edge from vertex u to vertex v having the given weight w.

 **Note:** A negative-weight cycle is a cycle in a graph whose edges sum to a negative value.

 **Examples:** 

```
Input: V = 4, E = 4, edges[][] = [[0, 3, 6], [1, 0, 4], [1, 2, 6], [3, 1, 2]]

Output: false
Explanation: Cycle 1 -> 0 -> 3 -> 1 has total weight 6 + 4 + 2 = 12, which is positive, so no negative weight cycle exists.

```

```
Input: V = 4, E = 4, edges[][] = [[1, 0, 4], [3, 1, -2], [1, 2, -6], [2, 3, 5]]

Output: true
Explanation: There is a cycle 1 -> 2 -> 3 -> 1 with total weight -3, which is negative, so a negative weight cycle exists.

```

  **Constraints:** 
1 ≤ V ≤ 103
0 ≤ E ≤ 105
0 ≤ u, v < V
-106 ≤ w ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T21:20:16.401Z  

```java
class Solution {
    public boolean isNegativeWeightCycle(int V, int[][] edges) {
        // code here
        int dist[] = new int[V];
        Arrays.fill(dist ,0);
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < V - 1; i++){
            for(int e[] : edges){
                int u = e[0];
                int v = e[1];
                int wt = e[2];
                if(dist[u] + wt < dist[v]){
                    dist[v] = wt + dist[u];
                }
            }
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            if( dist[u] + wt < dist[v]){
                return true;
            }
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/negative-weight-cycle3504/1)