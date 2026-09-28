# Largest Region of 1's in a Binary Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a grid of dimensions nxm containing 0's and 1's. Find the count of 1's in the largest region of 1's. A region of 1's is a group of 1's where two 1s can be adjacent to each other in any of the 8 directions (2 horizontal, 2 vertical and 4 diagonal). 

 **Examples :** 

```
Input: grid[][] = [[1, 1, 1, 0], [0, 0, 1, 0], [0, 0, 0, 1], [1, 1, 0, 0]]
Output: 5
Explanation: 

The largest region has five 1s 
```

```
Input: grid[][] = [[0,1]]
Output: 1
Explanation: The largest region of 1's is 1.

```

 **Constraints:** 
1 ≤ n, m ≤ 500

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T09:17:29.547Z  

```java
class Solution {
    int largestRegion(int[][] grid) {
        // code here
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][]=  new boolean[n][m];
        int max = 0;
        
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    visited[i][j] = true;
                    q.add(new int[]{i , j});
                      int count = 0;
                   while(!q.isEmpty()){
                       int curr[] = q.remove();
                       int r = curr[0];
                       int c  = curr[1];
                       count++;
                       for(int k = 0; k < 8; k++){
                           int nr = r + dr[k];
                           int nc = c + dc[k];
                           if(nr >= 0 && nr < n && nc >= 0 && nc < m && 
                           grid[nr][nc] == 1 && !visited[nr][nc]){
                               visited[nr][nc] = true;
                               q.add(new int[]{nr , nc});
                           }
                       }
                   }
                max = Math.max(count , max);
                }
            }
        }
        return max;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1)