//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        boolean vis[][] = new boolean[n][m];
        int delR[] = {-1, 0, +1, 0};
        int delC[] = {0, +1, 0, -1};
        for(int i = 0; i < m; i++) {
            if(!vis[0][i] && a[0][i] == 'O')
                dfs(0, i, a, vis, delR, delC);
            if(!vis[n-1][i] && a[n-1][i] == 'O')
                dfs(n-1, i, a, vis, delR, delC);
        }
        
        for(int i = 0; i < n; i++) {
            if(!vis[i][0] && a[i][0] == 'O')
                dfs(i, 0, a, vis, delR, delC);
            if(!vis[i][m-1] && a[i][m-1] == 'O')
                dfs(i, m-1, a, vis, delR, delC);
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(!vis[i][j] && a[i][j] == 'O')
                    a[i][j] = 'X';
            }
        }
        return a;
    }
    
    static void dfs(int row, int col, char a[][], boolean vis[][], int delR[], int delC[]) {
        
        
        vis[row][col] = true;
        
        for(int i = 0; i < 4; i++) {
            int newR = row + delR[i];
            int newC = col + delC[i];
            if(newR >= 0 && newR < vis.length && newC >= 0 && newC < vis[0].length && !vis[newR][newC] && a[newR][newC] == 'O')
                dfs(newR, newC, a, vis, delR, delC);
        }
        
    }
}