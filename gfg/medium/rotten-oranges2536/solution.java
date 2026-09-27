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