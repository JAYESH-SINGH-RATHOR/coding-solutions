# Bellman Ford

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a weighted graph with  **V**  vertices numbered from 0 to V-1 and  **E**  edges, represented by a 2d array  **edges[][]**, where edges[i] = [u, v, w] represents a direct edge from node u to v having w edge weight. You are also given a source vertex  **src**.

Compute the shortest distances from the src to all other vertices. If a vertex is unreachable from the src, its distance should be marked as 108. Additionally, if the graph contains a negative weight cycle, return [-1] to indicate that shortest paths cannot be reliably computed.

 **Examples:** 

```
Input: V = 5, edges[][] = [[1, 3, 2], [4, 3, -1], [2, 4, 1], [1, 2, 1], [0, 1, 5]], src = 0

Output: [0, 5, 6, 6, 7]
Explanation: Shortest Paths:
For 0 to 1 minimum distance will be 5. By following path 0 -> 1
For 0 to 2 minimum distance will be 6. By following path 0 -> 1 -> 2
For 0 to 3 minimum distance will be 6. By following path 0 -> 1 -> 2 -> 4 -> 3 
For 0 to 4 minimum distance will be 7. By following path 0 -> 1 -> 2 -> 4

```

```
Input: V = 4, edges[][] = [[0, 1, 4], [1, 2, -6], [2, 3, 5], [3, 1, -2]], src = 0

Output: [-1]
Explanation: The graph contains a negative weight cycle formed by the path 1 -> 2 -> 3 -> 1, where the total weight of the cycle is negative.

```

**Constraints:
**1 ≤ V ≤ 100
1 ≤ E = edges.size() ≤ V*(V-1)
-1000 ≤ w ≤ 1000
0 ≤ src < V

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T19:59:38.545Z  

```java
class Solution {
    public ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 1; i <= V - 1; i++) {
            for (int[] e : edges) {
                int u = e[0];
                int v = e[1];
                int wt = e[2];
                if (dist[u] != Integer.MAX_VALUE &&
                    dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }
        // Check for negative weight cycle
        for (int[] e : edges) {

            int u = e[0];
            int v = e[1];
            int wt = e[2];
            if (dist[u] != Integer.MAX_VALUE &&
                dist[u] + wt < dist[v]) {
                res.add(-1);
                return res;
            }
        }
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                res.add((int) 1e8);
            } else {
                res.add(dist[i]);
            }
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1)