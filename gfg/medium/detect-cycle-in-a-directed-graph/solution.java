class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean visited[] = new boolean[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean path[] = new boolean[V];
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u= e[0];
            int v = e[1];
            adj.get(u).add(v);
        }
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(dfsUtil( i , path , visited , adj )){
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfsUtil(int curr , boolean path[] , boolean visited[]
    , ArrayList<ArrayList<Integer>> adj){
        visited[curr] = true;
        path[curr] = true;
        for(int e : adj.get(curr)){
            if(path[e]){
                return true;
            }
            if(!visited[e]){
                visited[e] = true;
                if(dfsUtil(e , path , visited , adj)){
                    return true;
                }
            }
        }
        path[curr] = false;
        return false;
    }
}