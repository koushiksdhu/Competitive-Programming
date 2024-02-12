//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int n){
       
       long MOD = (int)(1e9+7);
       long ans = 0, num = 1;
       for(int i = 0; i < n; i++) {
           long val = 1;
           for(int j = 0; j <= i; j++) {
               val = ((val % MOD) * num++) % MOD;
           }
           ans = (ans % MOD + val % MOD) % MOD;
       }
       return ans;
       
    }
}