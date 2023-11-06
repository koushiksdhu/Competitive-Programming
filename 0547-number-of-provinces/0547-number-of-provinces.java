class Solution {
    public int findCircleNum(int[][] isConnected) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < isConnected.length; i++)
            adj.add(new ArrayList<>());

        for(int i = 0; i < isConnected.length; i++) {
            for(int j = 0; j < isConnected[i].length; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int V = adj.size();
        boolean vis[] = new boolean[V+1];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < V; i++) {
            if(!vis[i]){
                count++;
                bfs(i, adj, vis, q);
            }
        }
        return count;
    }

    void bfs(int i, ArrayList<ArrayList<Integer>> adj, boolean vis[], Queue<Integer> q) {
        q.add(i);
        vis[i] = true;

        while(!q.isEmpty()) {
            int node = q.poll();

            for(int data : adj.get(node)){
                if(!vis[data]){
                    q.add(data);
                    vis[data] = true;
                }
            }
        }
    }
}