//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/

// Topo Sort using DFS





// class Solution
// {
//     //Function to return list containing vertices in Topological order. 
//     static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
//     {
//         boolean vis[] = new boolean[V];
//         Stack<Integer> stk = new Stack<>();
//         for(int i = 0; i < V; i++) {
//             if(!vis[i])
//                 dfs(i, adj, vis, stk);
//         }
        
//         int ans[] = new int[stk.size()];
//         for(int i = 0; i < ans.length; i++) {
//             ans[i] = stk.pop();
//         }
//         return ans;
//     }
//     static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean vis[], Stack<Integer> stk) {
//         vis[node] = true;
        
//         for(int idx : adj.get(node)) {
//             if(!vis[idx])
//                 dfs(idx, adj, vis, stk);
//         }
//         stk.push(node);
//     }
// }








// Topo Sort using BFS: Kahn's Algorithm

// Inderee: Number of incoming edges to a node is called Indegree.

class Solution
{
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int indegree[] = new int[V];
        for(int i = 0; i < V; i++) {
            for(int v : adj.get(i)) {
                indegree[v]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++) {
            if(indegree[i] == 0)
                q.add(i);
        }
        
        int topo[] = new int[V];
        int idx = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            topo[idx++] = node;
            
            for(int v : adj.get(node)) {
                indegree[v]--;
                if(indegree[v] == 0)
                    q.add(v);
            }
        }
        return topo;
    }
}
