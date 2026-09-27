# Rotten Oranges

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a matrix  **mat[][]**, where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
 **0** : Empty cell
 **1**  : Cell have fresh oranges
 **2**  : Cell have rotten oranges

Determine the minimum time required so that all the oranges become rotten. A rotten orange at index (i, j) can rot other fresh orange at indexes (i-1, j), (i+1, j), (i, j-1), (i, j+1) (up, down, left and right) in a unit time.

 **Note**  **:**  If it is impossible to rot every orange then simply return -1.

 **Examples:** 

```
Input: mat[][] = [[2, 1, 0, 2, 1], [1, 0, 1, 2, 1], [1, 0, 0, 2, 1]]
Output: 2
Explanation: 

Oranges at positions (0,0), (0,3), (1,3), and (2,3) will rot adjacent fresh oranges in successive time frames.
All fresh oranges become rotten after 2 units of time.
```

```
Input: mat[][] = [[2, 1, 0, 2, 1], [0, 0, 1, 2, 1], [1, 0, 0, 2, 1]]
Output: -1
Explanation: Oranges at positions (0,0), (0,3), (1,3), and (2,3) rot some fresh oranges,
but the fresh orange at (2,0) can never be reached, so not all oranges can rot.

```

 **Constraints:** 
1 ≤ mat.size() ≤ 500
1 ≤ mat[0].size() ≤ 500
mat[i][j] = {0, 1, 2}

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T17:33:45.750Z  

```java
class Solution {
    public int orangesRot(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int time = 0;
        int freshOranges = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 2){
                    q.add(new int[]{i , j});
                }else if(mat[i][j] == 1){
                    freshOranges++;
                }
            }
        }
        int directions[][] ={
                      {-1, 0},
                      {1, 0},
                      {0, -1},
                      {0, 1}
        };
        while(!q.isEmpty() && freshOranges > 0){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int curr[] = q.remove();
                int r = curr[0];
                int c = curr[1];
                for(int e[] : directions){
                    int nr = r + e[0];
                    int nc = c + e[1];
                    if(nr >= 0 && nr < n && nc >= 0 && nc < m &&
                    mat[nr][nc] == 1){
                        mat[nr][nc] = 2;
                        q.add(new int[]{nr , nc});
                        freshOranges--;
                    }
                }
            }
            time++;
        }
        return freshOranges == 0 ? time : -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotten-oranges2536/1)