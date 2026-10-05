# Connected Groups of 1s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an  **n × m**  binary  **grid**, count the number of connected groups formed by cells containing 1. Two cells belong to the same group if they are adjacent  **horizontally** or  **vertically**. Diagonal adjacency is not considered.

 **Examples:** 

```
Input: n = 3, m = 4, grid[][] = [[1, 0, 1, 1], [1, 0, 0, 0], [0, 0, 1, 1]]
Output: 3
Explanation: The grid is- 

The 1s form three separate connected groups when considering only horizontal and vertical adjacency as shown in figure.
```

```
Input: n = 2, m = 2, grid = [[1, 1], [1, 1]]
Output: 1
Explanation: The grid is -   

All 1s are connected through horizontal or vertical adjacency, forming a single group.
```

 **Constraints:** 
1 ≤ n, m ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:55:43.620Z  

```java
class Solution {
    public int countGroups(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean visited[][] = new boolean[n][m];
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    // New group found
                    count++;
                    visited[i][j] = true;
                    q.add(new int[]{i, j});
                    while (!q.isEmpty()) {
                        int curr[] = q.remove();
                        int r = curr[0];
                        int c = curr[1];
                        for (int k = 0; k < 4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                            if (nr >= 0 && nr < n &&
                                nc >= 0 && nc < m &&
                                grid[nr][nc] == 1 &&
                                !visited[nr][nc]) {
                                visited[nr][nc] = true;
                                q.add(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/x-total-shapes3617/1)