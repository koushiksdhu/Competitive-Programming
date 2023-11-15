//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String betterString(String str1, String str2) {
        int n1 = countSub(str1);
        int n2 = countSub(str2);
        return n1 >= n2 ? str1 : str2;
    }
    private static int countSub(String str) {
        int n = str.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i-1]) %  1000000007;
            if(hm.containsKey(str.charAt(i-1))) {
                int idx = hm.get(str.charAt(i-1));
                dp[i] = (dp[i] - dp[idx-1] +  1000000007) %  1000000007;
            }
            hm.put(str.charAt(i-1), i);
        }
        return dp[n];
    }
}