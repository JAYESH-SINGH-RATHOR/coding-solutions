// class Solution {
//     public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
//         // code here
//         ArrayList<Integer> res = new ArrayList<>();
//       boolean visited[] = new boolean[adj.size()];
//       Queue<Integer> q = new LinkedList<>();
//       q.add(0);
//       visited[0] = true;
//      while(!q.isEmpty()){
//          int curr = q.remove();
//          res.add(curr);
//         for(int e : adj.get(curr)){
//              if(!visited[e]){
//              visited[e] = true;
//              res.add(e);
//          }
//         }
//      }
//       return res;
//     }
// }

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];

        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int e = q.poll();
            res.add(e);

            for (int neighbour : adj.get(e)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return res;
    }
}