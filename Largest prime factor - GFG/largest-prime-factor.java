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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long largestPrimeFactor(int N) {
    //   for (int i = N; i >= 2; i--) {
    //     for (int j = N; j >= 2; j--) {
    //         if (i % j == 0 && isPrime(j)) 
    //             return j;
    //     }
    // }
    // return N;
    // }
    // static boolean isPrime(int N){
    //     if (N <= 1) 
    //         return false;
    //     for (int j = 2; j <= Math.sqrt(N); j++){
    //         if (N % j == 0) 
    //             return false; 
    //     }
    //     return true; 
    
    // The above code throws TLE.
    
    // Optimal appraoch:
    
        long lgPrime = -1;
        
        for(int i = 2; i * i <= N; i++){
            while(N % i == 0){
                lgPrime = i;
                N /= i;        
            }
        }
        if(N > 1)
            lgPrime =N;
        
        return lgPrime;
    }
}