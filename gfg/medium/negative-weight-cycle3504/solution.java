class Solution {
    public boolean isNegativeWeightCycle(int V, int[][] edges) {
        // code here
        int dist[] = new int[V];
        Arrays.fill(dist ,0);
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < V - 1; i++){
            for(int e[] : edges){
                int u = e[0];
                int v = e[1];
                int wt = e[2];
                if(dist[u] + wt < dist[v]){
                    dist[v] = wt + dist[u];
                }
            }
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            if( dist[u] + wt < dist[v]){
                return true;
            }
        }
        return false;
    }
}