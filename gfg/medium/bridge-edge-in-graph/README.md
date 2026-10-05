# Bridge Edge in a Graph

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an undirected graph with  **V**  vertices numbered from  **0** to **V-1**  and  **E** edges, represented by 2d array  **edges[][]**, where edges[i]=[u,v] represents the edge between the vertices u and v. Determine whether a specific edge between two vertices (c, d) is a bridge.

 **Note:** 

- An edge is called a bridge if removing it increases the number of connected components of the graph.
- if there’s only one path between c and d (which is the edge itself), then that edge is a bridge.

 **Examples :** 

```
Input: V = 4, edges[][] = [[0, 1], [1, 2], [2, 3]], c = 1, d = 2

Output: true
Explanation: From the graph, we can clearly see that blocking the edge 1-2 will result in disconnection of the graph.
Hence, it is a Bridge.

```

```
Input: V = 5, edges[][] = [[0, 1], [0, 3], [1, 2], [2, 0], [3, 4]], c = 0, d = 2
 
Output: false
Explanation:
 
Blocking the edge between nodes 0 and 2 won't affect the connectivity of the graph.
So, it's not a Bridge Edge. All the Bridge Edges in the graph are marked with a green line in the above image.

```

 **Constraints:** 
1 ≤ V, E ≤ 105
0 ≤ c, d ≤ V-1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:03:39.224Z  

```java
class Solution {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        q.add(c);
        visited[c] = true;
                while(!q.isEmpty()){
                    int curr = q.remove();
                   
                    for(int e : adj.get(curr)){
                        if((curr == c && e == d)
                        || (curr == d && e == c)){
                            continue;
                        }
                        if(!visited[e]){
                            visited[e] =true;
                            q.add(e);
                        }
                    }
                }
          return !visited[d];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bridge-edge-in-graph/1)