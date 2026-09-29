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