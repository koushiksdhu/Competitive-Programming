//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.isReversible(s, n));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int isReversible(String str, int n) 
    { 
        int i = 0, j = n-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j))
                return 0;
            i++;
            j--;
        }
    return 1;
    }
}