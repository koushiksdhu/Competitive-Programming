//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException 
    { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int n1 = Integer.parseInt(input_line[0]);
            int n2 = Integer.parseInt(input_line[1]);
            int n3 = Integer.parseInt(input_line[2]);
            input_line = read.readLine().trim().split("\\s+");
            String A = input_line[0];
            String B = input_line[1];
            String C = input_line[2];
            Solution obj = new Solution();
            System.out.println(obj.LCSof3(A, B, C, n1, n2, n3));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        int dp[][][] = new int[A.length()][B.length()][C.length()];
        for(int row2D[][] : dp)
            for(int row1D[] : row2D)
                Arrays.fill(row1D, -1);
                
        return helperFunction(A, B, C, dp, 0, 0, 0);
        
    }
    private int helperFunction(String A, String B, String C, int dp[][][], int i, int j, int k) {
        if(i == A.length() || j == B.length() || k == C.length())
            return 0;
            
        else if(dp[i][j][k] != -1)
            return dp[i][j][k];
            
        else if(A.charAt(i) == B.charAt(j) && B.charAt(j) == C.charAt(k))
            return dp[i][j][k] = 1 + helperFunction(A, B, C, dp, i+1, j+1, k+1);
        
        else
            return dp[i][j][k] = Math.max(helperFunction(A, B, C, dp, i+1, j, k), Math.max(helperFunction(A, B, C, dp, i, j+1, k), helperFunction(A, B, C, dp, i, j, k+1))); 
    }
}