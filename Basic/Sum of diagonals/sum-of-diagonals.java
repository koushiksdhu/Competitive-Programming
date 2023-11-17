//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			int [][] M = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					M[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.sumDiagonal(N, M));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int sumDiagonal(int N, int [][] M) {
	    int principal = 0;
		for(int i = 0; i < M.length; i++) {
		    principal += M[i][i];
		}
		return principal;
	}
}