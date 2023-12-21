//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        if(S.length() == 1)
            return S;
        String res = "";
        for(int i = 1; i < S.length(); i++) {
            if(S.charAt(i-1) != S.charAt(i))
                res += S.charAt(i-1);
        }
        if(res.charAt(res.length()-1) != S.charAt(S.length()-1))
            res += S.charAt(S.length() - 1);
        return res;
    }
}