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
       
      return HandlerFunction(n, 1, 1);
       
    }
    static long HandlerFunction(long n, long start, long counter) {
        if(n == 0)
            return 0;
        long val = 1, MOD = (long)(1e9+7);
        for(int num = 1; num <= counter; num++) {
            val = (val % MOD * start++) % MOD;
        }
        
        return (val % MOD + HandlerFunction(n-1, start, counter + 1) % MOD) % MOD;
    }
}