class Solution {
    public ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 1; i <= V - 1; i++) {
            for (int[] e : edges) {
                int u = e[0];
                int v = e[1];
                int wt = e[2];
                if (dist[u] != Integer.MAX_VALUE &&
                    dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }
        // Check for negative weight cycle
        for (int[] e : edges) {

            int u = e[0];
            int v = e[1];
            int wt = e[2];
            if (dist[u] != Integer.MAX_VALUE &&
                dist[u] + wt < dist[v]) {
                res.add(-1);
                return res;
            }
        }
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                res.add((int) 1e8);
            } else {
                res.add(dist[i]);
            }
        }
        return res;
    }
}