//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        long prefix[] = new long[arr.length];
        long suffix[] = new long[arr.length];
        
        long preProd = 1;
        long suffProd = 1;
        
        for(int i  = 0; i < arr.length; i++){
            prefix[i] = preProd;
            preProd *= arr[i];
            suffix[n-i-1] = suffProd;
            suffProd *= arr[n-i-1];
        }
        
        for(int i = 0; i < arr.length; i++){
            prefix[i] = prefix[i]*suffix[i];
        }
        return prefix;
	} 
} 
