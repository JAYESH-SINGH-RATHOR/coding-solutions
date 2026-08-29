class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            if(curr == dest){
                return true;
            }
            
            for(int e : adj.get(curr)){
                if(!visited[e]){
                    visited[e] = true;
                    q.add(e);
                }
            }
        }
        return false;
    }
}
