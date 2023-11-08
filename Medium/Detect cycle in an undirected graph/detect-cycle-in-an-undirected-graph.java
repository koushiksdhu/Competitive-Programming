//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

class Pair {
    int r, c;
    Pair(int r, int c){
        this.r = r;
        this.c = c;
    }
}


class Solution {
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if(vis[i] == false)
                if(cycle(i, V, adj, vis) == true)
                    return true;
        }
        return false;
    }
    boolean cycle(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean vis[]){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        vis[src] = true;
        
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int row = p.r;
            int col = p.c;
            
            for(int i : adj.get(row)){
                if(!vis[i]){
                    vis[i] = true;
                    q.add(new Pair(i, row));
                }
                else if (col != i)
                    return true;
            }
        }
        return false;
    }
}