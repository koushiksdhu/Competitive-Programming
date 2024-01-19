//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Pair {
    int first, second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
           adj.add(new ArrayList<Pair>()); 
        }
        
        for(int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }
        
        boolean vis[] = new boolean[N];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < N; i++) {
            if(!vis[i])
                topoSort(i, adj, vis, stk);
        }
        
        int dist[] = new int[N];
        for(int i = 0; i < N; i++) {
            dist[i] = (int)(1e9);
        }
        
        dist[0] = 0;
        while(!stk.isEmpty()) {
            int node = stk.pop();
            
            for(int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;
                
                if(dist[node] + wt < dist[v]) {
                    dist[v] = wt + dist[node];
                }
            }
        }
        for(int i = 0; i < dist.length; i++) {
            if(dist[i] == (int)(1e9))
                dist[i] = -1;
        }
        return dist;
	}
	
	private void topoSort(int idx, ArrayList<ArrayList<Pair>> adj, boolean vis[], Stack<Integer> stk) {
	    vis[idx] = true;
	    for(int i = 0; i < adj.get(idx).size(); i++) {
	        int v = adj.get(idx).get(i).first;
	        if(!vis[v])
	            topoSort(v, adj, vis, stk);
	    }
	    stk.add(idx);
	}
}