class Solution {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        q.add(c);
        visited[c] = true;
                while(!q.isEmpty()){
                    int curr = q.remove();
                   
                    for(int e : adj.get(curr)){
                        if((curr == c && e == d)
                        || (curr == d && e == c)){
                            continue;
                        }
                        if(!visited[e]){
                            visited[e] =true;
                            q.add(e);
                        }
                    }
                }
          return !visited[d];
    }
}