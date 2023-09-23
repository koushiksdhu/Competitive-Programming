//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        int count = 0;
    	for(int i = 0; i < M.length; i++){
    	    for(int j = 0; j < M[0].length; j++){
    	        if(i == j)
    	            continue;
    	        else if(M[j][i] == 1 && M[i][j] != M[j][i]){
    	            count++;
    	            if(count == M.length-1)
    	                return i;
    	        }
    	        else
    	            break;
    	    }
    	}
    	return -1;
    }
}