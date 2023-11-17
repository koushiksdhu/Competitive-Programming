//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDiagonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
       HashMap<Integer, ArrayList<Integer>> hm = new LinkedHashMap<>();
       ArrayList<Integer> al = new ArrayList<>();
       
       for(int i = 0; i < N; i++) {
           for(int j = 0; j < N; j++) {
               int idx = i+j;
               ArrayList<Integer> temp = hm.getOrDefault(idx, new ArrayList<Integer>());
               temp.add(A[i][j]);
               hm.put(idx, temp);
           }
       }
       
       for(ArrayList<Integer> a : hm.values()) {
           for(int v : a)
                al.add(v);
       }
       return al;
    }
}
