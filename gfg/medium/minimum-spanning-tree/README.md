# Minimum Spanning Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a weighted, undirected, and connected graph with  **V**  vertices and a 2D array **edges[][]**, where each element edges[i] = [u, v, w] represents an edge between vertices u and v with weight w, return the sum of the weights of all edges in the graph's Minimum Spanning Tree (MST).

```
Input: V = 3, E = 3, Edges = [[0, 1, 5], [1, 2, 3], [0, 2, 1]]
 
Output: 4
Explanation:

The Spanning Tree resulting in a weight
of 4 is shown above.
```

```
Input: V = 2, E = 1, Edges = [[0 1 5]]

 

Output: 5 
Explanation: Only one Spanning Tree is possible which has a weight of 5.

```

**Constraints:
**2 ≤ V ≤ 1000
V-1 ≤ E ≤ (V*(V-1))/2
1 ≤ w ≤ 1000
The graph is connected and doesn't contain self-loops & multiple edges.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T23:10:20.697Z  

```java
class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        boolean visited[] = new boolean[V];
        PriorityQueue<int[]> pq = 
        new PriorityQueue<>((a , b) -> a[1] - b[1]);
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            adj.get(u).add(new int[]{v , wt});
            adj.get(v).add(new int[]{u , wt});
        }
        pq.add(new int[]{ 0 , 0});
        while(!pq.isEmpty()){
            int curr[] = pq.remove();
            int currnode = curr[0];
            int wtt = curr[1];
            if(visited[currnode]){
                continue;
            }
            visited[currnode] = true;
            sum += wtt;
            for(int e[] : adj.get(currnode)){
                int next = e[0];
                int wttt = e[1];
                if(!visited[next]){
                    pq.add(new int[]{next , wttt});
                }
            }
        }
        return sum;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1)