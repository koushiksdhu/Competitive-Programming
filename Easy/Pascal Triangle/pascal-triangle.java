//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
       long MOD = (long)1e9+7;
       ArrayList<Long> ans = new ArrayList<>();
       for(int i = 0; i < n; i++) {
           ans.add(1l);
       }
       
       for(int i = 1; i < n; i++) {
           for(int j = i-1; j > 0; j--) {
               ans.set(j, (ans.get(j) + ans.get(j-1)) % MOD);
           }
       }
       return ans;
    }
}