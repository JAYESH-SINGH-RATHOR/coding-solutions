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