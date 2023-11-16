//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        boolean pathVisit[] = new boolean[V];
        
        for(int i = 0; i < vis.length; i++) {
            if(vis[i] == false){
                if(dfs(i, adj, vis, pathVisit) == true)
                    return true;
            }
        }
        return false;
    }
    boolean dfs(int start, ArrayList<ArrayList<Integer>> adj, boolean vis[], boolean pathVisit[]) {
        vis[start] = true;
        pathVisit[start] = true;
        
        for(int idx : adj.get(start)) {
            if(vis[idx] == false) {
                if(dfs(idx, adj, vis, pathVisit) == true)
                    return true;
            }
            else if(pathVisit[idx] == true)
                return true;
        }
        
        pathVisit[start] = false;
        return false;
    }
}