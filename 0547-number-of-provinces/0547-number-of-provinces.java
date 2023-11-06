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
        int count = 0;
        for(int i = 0; i < V; i++) {
            if(!vis[i]){
                count++;
                dfs(i, adj, vis);
            }
        }
        return count;
    }

    void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean vis[]) {
        vis[i] = true;
        for(int idx : adj.get(i)){
            if(!vis[idx])
                dfs(idx, adj, vis);
        }
    }
}