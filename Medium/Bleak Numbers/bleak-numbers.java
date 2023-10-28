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
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.is_bleak(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int is_bleak(int n)
    {
        if(n <= 32) {
            for(int i = 1; i <= 32; i++){
                int x = i;
                int count = 0;
                for(int j = 0; j < 32; j++){
                    if(((1<<j) & x) > 0)
                        count++;
                }
                if(count + x == n)
                    return 0;
            }
            return 1;
        }
        else {
            int s = n - 32;
            for(int i = s; i <= n; i++){
                int x = i;
                int count = 0;
                for(int j = 0; j < 32; j++){
                    if(((1<<j) & x) > 0)
                        count++;
                }
                if(count + x == n)
                    return 0;
            }
            return 1;
        }
    }
}