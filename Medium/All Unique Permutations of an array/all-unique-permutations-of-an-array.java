//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0; i<n; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> res = ob.uniquePerms(arr,n);
            for(int i=0; i<res.size(); i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        HashSet<ArrayList<Integer>> hs = new LinkedHashSet<>();
        boolean vis[] = new boolean[arr.size()];
        permute(arr, new ArrayList<>(), hs, vis);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(ArrayList<Integer> idx : hs) {
            ans.add(idx);
        }
        Collections.sort(ans, (a, b) -> {
            for(int i = 0; i < a.size(); i++) {
                if(a.get(i) != b.get(i))
                    return a.get(i) - b.get(i);
            }
            return a.get(0) - b.get(0);
        });
        
        return ans;
    }
    static void permute(ArrayList<Integer> arr, ArrayList<Integer> temp, HashSet<ArrayList<Integer>> hs, boolean vis[]) {
        if(arr.size() == temp.size()) {
            hs.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = 0; i < arr.size(); i++) {
            if(!vis[i]) {
                vis[i] = true;
                temp.add(arr.get(i));
                permute(arr, temp, hs, vis);
                vis[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
};