class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean visited[] = new boolean[n];
        List<List<Integer>> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            res.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            res.get(u).add(v);
            res.get(v).add(u);
        }        
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            if(curr == destination){
                return true;
            }
            for(int e : res.get(curr)){
                if(!visited[e]){
                    visited[e] = true;
                    q.add(e);
                }
            }
        }
        return false;
    }
}