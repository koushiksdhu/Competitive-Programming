//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            int k = sc.nextInt();
            int answer = new Solution().kSubstrConcat(n,s,k);
    		System.out.println(answer);
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        if(n % k != 0)
            return 0;
        else if(n == k)
            return 1;
            
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < n; i += k) {
            String temp = s.substring(i, i+k);
            hm.put(temp, hm.getOrDefault(temp, 0) + 1);
        }
        
        if(hm.size() > 2) 
            return 0;
            
        boolean flag = true;
        for(int i : hm.values()) {
            if(i > 1) {
                if(flag)
                    flag = false;
                else
                    return 0;
            }
        }
    return 1;
    }
}