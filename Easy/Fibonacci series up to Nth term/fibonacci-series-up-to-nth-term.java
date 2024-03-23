//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int MOD = (int)(1e9+7);
        for(int i = 2; i <= n; i++)
            arr[i] = (arr[i-1] % MOD + arr[i-2] % MOD) % MOD;
        return arr;
    }
}