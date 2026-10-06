# Distance of nearest cell having 1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary  **grid[][],**  where each cell contains either 0 or 1, find the distance of the nearest  **1**  for every cell in the grid.
The distance between two cells (i1, j1)  and (i2, j2) is calculated as  **|i1 - i2| + |j1 - j2|.**  
You need to return a matrix of the same size, where each cell (i, j) contains the  **minimum distance**  from grid[i][j] to the nearest cell having value 1.

 **Note:** It is guaranteed that there is at least one cell with value 1 in the grid.

 **Examples** 

```
Input: grid[][] = [[0, 1, 1, 0], 
                [1, 1, 0, 0], 
                [0, 0, 1, 1]]
Output: [[1, 0, 0, 1], 
        [0, 0, 1, 1], 
        [1, 1, 0, 0]]
Explanation: The grid is -

- 0's at (0,0), (0,3), (1,2), (1,3), (2,0) and (2,1) are at a distance of 1 from 1's at (0,1), (0,2), (0,2), (2,3), (1,0) and (1,1) respectively.

```

```
Input: grid[][] = [[1, 0, 1], 
                [1, 1, 0], 
                [1, 0, 0]]
Output: [[0, 1, 0], 
        [0, 0, 1], 
        [0, 1, 2]]
Explanation: The grid is -

- 0's at (0,1), (1,2), (2,1) and (2,2) are at a  distance of 1, 1, 1 and 2 from 1's at (0,0), (0,2), (2,0) and (1,1) respectively.

```

 **Constraints:** 
1 ≤ grid.size() ≤ 200
1 ≤ grid[0].size() ≤ 200

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T00:16:36.229Z  

```java
class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
            // code here
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};
        int ans[][] = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    visited[i][j] = true;
                    q.add(new int[]{i, j});
                }
            }
        }
        while(!q.isEmpty()){
            int curr[] = q.remove();
            int r = curr[0];
            int c = curr[1];
            for(int k = 0; k < 4; k++){
                int nr = dr[k] + r;
                int nc = c + dc[k];
                if(nr >= 0 && nr < n && 
                   nc >= 0 && nc < m &&
                   !visited[nr][nc]){
                    visited[nr][nc] = true;
                    ans[nr][nc] = ans[r][c] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        for(int i = 0; i < n; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < m; j++){
                row.add(ans[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distance-of-nearest-cell-having-1-1587115620/1)