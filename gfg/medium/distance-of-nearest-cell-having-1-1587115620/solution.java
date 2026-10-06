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