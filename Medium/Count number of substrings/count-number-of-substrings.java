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
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String S, int K) {
        return handlerFunction(S, K) - handlerFunction(S, K-1);
    }
    long handlerFunction(String S, int K){
        if (K < 0)
            return 0;
            
        int i = 0, j = 0, count = 0;
        long res = 0;
        int freq[] = new int[26];
        
        while(j < S.length()){
            freq[S.charAt(j) - 'a']++;
            if(freq[S.charAt(j) - 'a'] == 1)
                count++;
                
            while(count > K){
                freq[S.charAt(i) - 'a']--;
                if(freq[S.charAt(i) - 'a'] == 0)
                    count--;
                i++;
            }
            res += (j - i + 1);
            j++;
        }
        return res;
    }
}