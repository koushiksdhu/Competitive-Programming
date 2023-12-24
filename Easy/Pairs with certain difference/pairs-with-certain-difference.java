//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int K = Integer.parseInt(br.readLine().trim());
            
            Solution obj = new Solution();
            System.out.println(obj.maxSumPairWithDifferenceLessThanK(arr, N, K));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
       int sum = 0;
       Arrays.sort(arr);
       reverse(arr);
       for(int i = 0; i < arr.length - 1; i++) {
           if(arr[i] - arr[i+1] < K) {
               sum += arr[i] + arr[i+1];
               i++;
           }
       }
       return sum;
    }
    static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

