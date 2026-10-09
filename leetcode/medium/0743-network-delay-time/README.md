# Network Delay Time

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a network of `n` nodes, labeled from `1` to `n`. You are also given `times`, a list of travel times as directed edges `times[i] = (ui, vi, wi)`, where `ui` is the source node, `vi` is the target node, and `wi` is the time it takes for a signal to travel from source to target.

We will send a signal from a given node `k`. Return  *the  **minimum**  time it takes for all the*  `n`  *nodes to receive the signal*. If it is impossible for all the `n` nodes to receive the signal, return `-1`.

 

 **Example 1:** 

```
Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
Output: 2

```

 **Example 2:** 

```
Input: times = [[1,2,1]], n = 2, k = 1
Output: 1

```

 **Example 3:** 

```
Input: times = [[1,2,1]], n = 2, k = 2
Output: -1

```

 

 **Constraints:** 

- 1 <= k <= n <= 100
- 1 <= times.length <= 6000
- times[i].length == 3
- 1 <= ui, vi <= n
- ui != vi
- 0 <= wi <= 100
- All the pairs (ui, vi) are unique. (i.e., no multiple edges.)

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 25.13%)  
**Memory:** 48.7 MB (beats 86.01%)  
**Submitted:** 2026-10-09T09:29:53.799Z  

```java
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
       int dist[] = new int[n + 1];
       Arrays.fill(dist , Integer.MAX_VALUE);
       dist[k] = 0;
        for(int i = 1; i < n; i++){
            for(int e[] : times){
                int u = e[0];
                int v = e[1];
                int wt = e[2];
                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                    dist[v] = wt + dist[u];
                }
            }
        }
        int res = 0;
        for(int i = 1; i <= n; i++){
                if(dist[i] == Integer.MAX_VALUE) {
                    return -1;
            }
            res = Math.max(res , dist[i]);
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/network-delay-time/)