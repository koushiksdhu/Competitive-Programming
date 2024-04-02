//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    long ExtractNumber(String S){
        long max = -1;
        String str[] = S.split(" ");
        for(int i = 0; i < str.length; i++) {
            if(Character.isDigit(str[i].charAt(0)) && !str[i].contains("9"))
                max = Math.max(max, Long.parseLong(str[i]));
        }
        return max;
    }
}