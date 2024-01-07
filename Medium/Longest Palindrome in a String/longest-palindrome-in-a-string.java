//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        
        if(S.length() == 0 || S.length() == 1)
            return S;
            
        String ans = "" + S.charAt(0);
        for(int i = 0; i < S.length(); i++) {
            for(int j = S.length() - 1; j > i; j--) {
                if((j - i) + 1 <= ans.length())
                    break;
                if(S.charAt(i) == S.charAt(j)) {
                    if(isPalin(S, i, j))
                        if((j - i) + 1 > ans.length())
                            ans = S.substring(i, j + 1);
                }
            }
        }
        return ans;
    }
    static boolean isPalin(String str, int i, int j) {
        while(i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}