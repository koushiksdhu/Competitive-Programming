//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        
        Arrays.sort(arr);
        Arrays.sort(dep);

        // int platforms = 1; // Minimum one platform will be needed
        // int result = 1;
        // int i = 1; // Pointer for arrival times
        // int j = 0; // Pointer for departure times

        // while (i < n && j < n) {
        //     if (arr[i] <= dep[j]) {
        //         platforms++;
        //         i++;

        //         if (platforms > result) {
        //             result = platforms;
        //         }
        //     } else {
        //         platforms--;
        //         j++;
        //     }
        // }
        
       int i = 1, j = 0, pf = 1, tpf = pf;
       while(i < n && j < n){
           if(arr[i] <= dep[j]){
               pf++;
               i++;
               tpf = Math.max(pf, tpf);
           }
           else{
               pf--;
               j++;
           }
       }
        return tpf;
        
        
    }
    
}

