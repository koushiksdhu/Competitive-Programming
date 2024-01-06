//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long sumOfPowers(long a, long b) {
        long ans = 0;
        for(long i = a; i <= b; i++) {
            long n = i;
            for(long j = 2; j * j <= n; j++) {
                while(n % j == 0) {
                    ans++;
                    n /= j;
                }
            }
        if(n != 1)
            ans++;
        }
        return ans;
    }
}
        
