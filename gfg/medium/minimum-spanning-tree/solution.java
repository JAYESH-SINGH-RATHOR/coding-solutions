class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        boolean visited[] = new boolean[V];
        PriorityQueue<int[]> pq = 
        new PriorityQueue<>((a , b) -> a[1] - b[1]);
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            adj.get(u).add(new int[]{v , wt});
            adj.get(v).add(new int[]{u , wt});
        }
        pq.add(new int[]{ 0 , 0});
        while(!pq.isEmpty()){
            int curr[] = pq.remove();
            int currnode = curr[0];
            int wtt = curr[1];
            if(visited[currnode]){
                continue;
            }
            visited[currnode] = true;
            sum += wtt;
            for(int e[] : adj.get(currnode)){
                int next = e[0];
                int wttt = e[1];
                if(!visited[next]){
                    pq.add(new int[]{next , wttt});
                }
            }
        }
        return sum;
    }
}
