# Max Area of Island

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` binary matrix `grid`. An island is a group of `1`'s (representing land) connected  **4-directionally**  (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The  **area**  of an island is the number of cells with a value `1` in the island.

Return  *the maximum  **area**  of an island in* `grid`. If there is no island, return `0`.

 

 **Example 1:** 

```
Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.

```

 **Example 2:** 

```
Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 50
- grid[i][j] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 11.00%)  
**Memory:** 46.5 MB (beats 50.59%)  
**Submitted:** 2026-09-30T12:06:41.377Z  

```java
// class Solution {
//     public int maxAreaOfIsland(int[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
//         int max = 0;
//         boolean visited[][] = new boolean[n][m];
//         Queue<int[]> q = new LinkedList<>();
//          int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
//         int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 if(grid[i][j] == 1 && !visited[i][j]){
//                     visited[i][j] = true;
//                     q.add(new int[]{i , j});
//                     int count = 0;
//                     while(!q.isEmpty()){
//                         int curr[] = q.remove();
//                         int r = curr[0];
//                         int c = curr[1];
//                         count++;
//                         for(int k = 0; k < 8; k++){
//                             int nr = r + dr[k];
//                             int nc = c + dc[k];
//                             if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 1 && !visited[nr][nc]){
//                                 visited[nr][nc] = true;
//                                 q.add(new int[]{i , j});
//                             }
//                         }
//                     }
//                     max = Math.max(max , count);
//                 }
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int dr[] = {1, 0, -1, 0};
        int dc[] = {0, -1, 0, 1};
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1 && !visited[i][j]) {
                    int area = 0;
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                    while(!q.isEmpty()) {
                        int curr[] = q.remove();
                        int r = curr[0];
                        int c = curr[1];
                        area++;
                        for(int k = 0; k < 4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                if(nr >= 0 && nr < n && nc >= 0 && nc < m &&
                    grid[nr][nc] == 1 &&                          !visited[nr][nc]) {
                                q.add(new int[]{nr, nc});
                                visited[nr][nc] = true;
                            }
                        }
                    }
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/max-area-of-island/)