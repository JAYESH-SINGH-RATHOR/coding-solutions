# Network Delay Time

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a network of  **V**  nodes (numbered from 0 to V-1) and  **E**  number of directed connections, described by an array **edges[]**, where each element  **{u, v, w}**  specifies that a signal requires  **w**  units of time to propagate from node  **u**  to node  **v**.

A signal is transmitted from the source node  **src**. Return the minimum time it takes for all the nodes to receive the signal. If any node remains unreachable, return -1.

Note: There are no multiple edge connections in the network.

 **Examples:** 

```
Input: V = 3, edges[][] = [[0, 2, 1], [2, 1, 2], [0, 1, 4]], src = 0
Output: 3
Explanation: In 3 units of time the signal can cover all the nodes by following this path: 0 -> 2 -> 1.
```

```
Input: V = 2, edges[][] = [[0, 1, 5]], src = 1
Output: -1
Explanation: There is no connection from 1 to 0.
```

 **Constraint:** 

- 0 ≤ src < V ≤ 103
- 1 ≤ E ≤ 105
- 0 ≤ edges[i][0], edges[i][1] < V
- 0 ≤ edges[i][2] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T09:38:24.158Z  

```java
class Solution {
    public int findDelayTime(int V, int[][] edges, int src) {
        // code here
        int dist[] = new int[V + 1];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i = 0; i <= V - 1; i++){
            for(int e[] : edges){
                int u = e[0];
                int v = e[1];
                int wt = e[2];
               if(dist[u] != Integer.MAX_VALUE && 
               dist[u] + wt < dist[v]){
                   dist[v] = dist[u] + wt;
               }
            }
        }
        int res = 0;
        for(int i = 0; i <= V - 1; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            res = Math.max(res , dist[i]);
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/network-delay-time/1)