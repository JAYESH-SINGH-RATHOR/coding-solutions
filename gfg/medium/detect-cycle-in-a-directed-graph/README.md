# Directed Graph Cycle

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a directed graph with  **V**  vertices numbered from 0 to V - 1 and E directed edges. The graph is represented using a 2D array  **edges[][]**  of size E, where each entry edges[i] = [u, v] denotes a directed edge from vertex u to vertex v.

Check whether the graph contains any cycle. Return true if there exists at least one cycle in the graph; otherwise, return false.

 **Examples:** 

```
Input: V = 4, edges[][] = [[0, 1], [1, 2], [2, 0], [2, 3]]

Output: true
Explanation: The diagram clearly shows a cycle 0 -> 1 -> 2 -> 0
```

```
Input: V = 4, edges[][] = [[0, 1], [0, 2], [1, 2], [2, 3]]

Output: false
Explanation: no cycle in the graph
```

 **Constraints:** 
1 ≤ V ≤ 105
0 ≤ E ≤ 105
0 ≤ edges[i][0], edges[i][1] < V

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T20:06:55.977Z  

```java
class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean visited[] = new boolean[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean path[] = new boolean[V];
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u= e[0];
            int v = e[1];
            adj.get(u).add(v);
        }
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(dfsUtil( i , path , visited , adj )){
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfsUtil(int curr , boolean path[] , boolean visited[]
    , ArrayList<ArrayList<Integer>> adj){
        visited[curr] = true;
        path[curr] = true;
        for(int e : adj.get(curr)){
            if(path[e]){
                return true;
            }
            if(!visited[e]){
                visited[e] = true;
                if(dfsUtil(e , path , visited , adj)){
                    return true;
                }
            }
        }
        path[curr] = false;
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1)