# Check for Path in a 2D Grid with Obstacles

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a grid  **mat[][]**  of size **n × n**  containing integers  **0**,  **1**,  **2**, and  **3** having the following meanings

- 1 represents the source cell
- 2 represents the destination cell
- 3 represents a blank cell through which movement is allowed
- 0 represents a wall that cannot be traversed

There is exactly one source and one destination in the grid. 

- Find whether a path exists from the source cell to the destination cell. 
- Movement is allowed in four directions: up, down, left, and right.

 **Examples :** 

```
Input: mat[][] = {{0,3,1,0}, {3,0,3,3}, {2,3,0,3}, {0,3,3,3}}; 
Output: true
Explanation: A path exists from source 1 to destination 2 through valid cells 3.

```

```
Input: mat[][] = {{1,0,3}, {0,0,0}, {3,3,2}};
Output: false
Explanation: No path exists as the source 1 is blocked and cannot reach destination 2.
 
```

 **Constraints:** 
1 ≤ n ≤ 500

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T04:28:49.113Z  

```java
class Solution {
    public boolean isPathPossible(int[][] mat) {
        // code here
        int n = mat.length;
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        // Find source
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1) {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        int[][] directions = {
            {-1, 0},  // up
            {1, 0},   // down
            {0, -1},  // left
            {0, 1}    // right
        };
        while(!q.isEmpty()) {
            int[] curr = q.remove();
            int r = curr[0];
            int c = curr[1];
            if(mat[r][c] == 2) {
                return true;
            }
            for(int[] e : directions) {
                int nr = r + e[0];
                int nc = c + e[1];
                if(nr >= 0 && nr < n && nc >= 0 && nc < n &&
                   !visited[nr][nc] && mat[nr][nc] != 0) {
                    q.add(new int[]{nr, nc});
                    visited[nr][nc] = true;
                }
            }
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-whether-path-exist5238/1)