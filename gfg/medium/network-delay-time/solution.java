class Solution {
    public int findDelayTime(int V, int[][] edges, int src) {
        // code here
        int dist[] = new int[V + 1];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i = 0; i <= V - 1; i++){
            for(int e[] : edges){
                int u = e[0];
                int v = e[1];
                int wt = e[2];
               if(dist[u] != Integer.MAX_VALUE && 
               dist[u] + wt < dist[v]){
                   dist[v] = dist[u] + wt;
               }
            }
        }
        int res = 0;
        for(int i = 0; i <= V - 1; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            res = Math.max(res , dist[i]);
        }
        return res;
    }
}