# Cheapest Flights Within K Stops

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There are `n` cities connected by some number of flights. You are given an array `flights` where `flights[i] = [fromi, toi, pricei]` indicates that there is a flight from city `fromi` to city `toi` with cost `pricei`.

You are also given three integers `src`, `dst`, and `k`, return  ***the cheapest price**  from  *`src`*  to  *`dst`*  with at most  *`k`*  stops. *If there is no such route, return `-1`.

 

 **Example 1:** 

```
Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
Output: 700
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700.
Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.

```

 **Example 2:** 

```
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
Output: 200
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.

```

 **Example 3:** 

```
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
Output: 500
Explanation:
The graph is shown above.
The optimal path with no stops from city 0 to 2 is marked in red and has cost 500.

```

 

 **Constraints:** 

- 2 <= n <= 100
- 0 <= flights.length <= (n * (n - 1) / 2)
- flights[i].length == 3
- 0 <= fromi, toi < n
- fromi != toi
- 1 <= pricei <= 104
- There will not be any multiple flights between two cities.
- 0 <= src, dst, k < n
- src != dst

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 83.86%)  
**Memory:** 46.5 MB (beats 57.31%)  
**Submitted:** 2026-10-08T01:04:54.485Z  

```java
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        Queue<int[]> q = new LinkedList<>();
        int dist[] = new int[n];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : flights){
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            adj.get(u).add(new int[]{v , wt});
        }
        q.add(new int[]{src , 0  , 0});
        while(!q.isEmpty()){
            int curr[] = q.remove();
            int currnode = curr[0];
            int cost = curr[1];
            int stop = curr[2];
            if(stop > k){
                continue;
            }
            for(int e[] : adj.get(currnode)){
                int nextnode = e[0];
                int wt = e[1];
                if(cost + wt < dist[nextnode] && stop <= k){
                    dist[nextnode] = cost + wt;
                    q.add(new int[]{ nextnode,
                        dist[nextnode],
                        stop + 1});
                }
            }
        }
        if(dist[dst] == Integer.MAX_VALUE){
            return -1;
        }
        return dist[dst];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/cheapest-flights-within-k-stops/)