//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.TotalCount(str);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalCount(String str)
    {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.substring(i, i+1));
        }
        
        int dp[][] = new int[str.length()][sum+1];
        for(int row[] : dp)
            Arrays.fill(row, -1);
            
        int ans = 0;
        sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.substring(i, i+1));
            ans += handlerFunction(i + 1, sum, str, dp);
        }
        return ans;
    }
    int handlerFunction(int idx, int prev, String str, int dp[][]) {
        if(idx == str.length())
            return 1;
            
        if(dp[idx][prev] != -1)
            return dp[idx][prev];
            
        int sum = 0, ans = 0;
        
        for(int i = idx; i < str.length(); i++) {
            sum += Integer.parseInt(str.substring(i, i + 1));
            if(sum >= prev)
                ans += handlerFunction(i+1, sum, str, dp);
        }
        return dp[idx][prev] = ans;
    }
}