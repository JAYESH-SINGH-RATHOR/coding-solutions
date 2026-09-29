# Count Islands

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a grid of size  **n*m**  (n is the number of rows and m is the number of columns in the grid) consisting of  **'W'** s (Water) and  **'L'** s (Land). Find the number of islands.

 **Note:** An island is either surrounded by water or the boundary of a grid and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.

 **Examples:** 

```
Input: grid[][] = [['L', 'L', 'W', 'W', 'W'], 
                ['W', 'L', 'W', 'W', 'L'], 
                ['L', 'W', 'W', 'L', 'L'], 
                ['W', 'W', 'W', 'W', 'W'], 
                ['L', 'W', 'L', 'L', 'W']]
Output: 4
Explanation:
The image below shows all the 4 islands in the grid.
 
```

```
Input: grid[][] = [['W', 'L', 'L', 'L', 'W', 'W', 'W'], 
                ['W', 'W', 'L', 'L', 'W', 'L', 'W']]
Output: 2
Explanation:
The image below shows 2 islands in the grid.
 
```

 **Constraints:** 
1 ≤ n, m ≤ 500
grid[i][j] = {'L', 'W'}

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T10:01:24.834Z  

```java
class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1,  0,  1,-1, 1,-1, 0, 1};
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 'L' && !visited[i][j]){
                    count++;
                    q.add(new int[]{i , j});
                    visited[i][j] = true;
                    while(!q.isEmpty()){
                        int curr[] = q.remove();
                        int r = curr[0];
                        int c = curr[1];
                        for(int k = 0; k < 8; k++){
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                            if(nr >= 0 && nr < n && nc >= 0 && nc < m 
                            && grid[nr][nc] == 'L' && !visited[nr][nc]){
                                q.add(new int[]{nr , nc});
                                visited[nr][nc] = true;
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

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1)