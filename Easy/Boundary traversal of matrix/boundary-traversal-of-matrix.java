//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < matrix[0].length; i++){
            al.add(matrix[0][i]);
        }

    

        for(int i = 1; i < matrix.length; i++){
            al.add(matrix[i][matrix[0].length-1]);
        }

    
        for(int i = matrix[0].length-2; i >= 0; i--){
            if((n-1) != 0)
                al.add(matrix[matrix.length-1][i]);
        }

    

        for(int i = matrix.length-2; i > 0 ; i--){
            if((m-1) != 0)
                al.add(matrix[i][0]);
        }
        
        return al;
    }
}
